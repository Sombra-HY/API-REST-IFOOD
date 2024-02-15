package me.dio.marketapi.services.impl;

import lombok.RequiredArgsConstructor;
import me.dio.marketapi.model.Item;
import me.dio.marketapi.model.MarketBag;
import me.dio.marketapi.repository.MarketBagRepository;
import me.dio.marketapi.repository.ProductRepository;
import me.dio.marketapi.resource.dto.ItemDTO;
import me.dio.marketapi.services.MarketBagService;
import org.springframework.stereotype.Service;
import me.dio.marketapi.enumeratrion.PaymentMethod;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarketBagImpl implements MarketBagService {
    private final MarketBagRepository marketBagRepository;
    private final ProductRepository productRepository;


    @Override
    public MarketBag showMarketBag(long id) {
        return marketBagRepository
                .findById(id)
                .orElseThrow(
                        ()->{ throw new RuntimeException("This Marketbag does not exist");}
                );
    }

    @Override
    public MarketBag closeMarketBag(long IdMarketBag, int payMethod) {
        MarketBag marketBag =  showMarketBag(IdMarketBag);
        if(marketBag.getBagItens().isEmpty()){
            throw new RuntimeException("MarketBag is Empty!");
        }
        PaymentMethod payMet  = (payMethod == 0)?
                PaymentMethod.MONEY:PaymentMethod.CARD;
        marketBag.setIPaymentMethod(payMet);
        marketBag.setIsbagClose(true);
        return marketBagRepository.save(marketBag);

    }

    @Override
    public Item addMarketBag(ItemDTO itemDTO) {
        MarketBag marketBag = showMarketBag(itemDTO.getMarketBagId());
        List<Item> bagItens = marketBag.getBagItens();

        if(marketBag.isIsbagClose()) {
            throw new RuntimeException("MarketBag is Closed!");
        }
        Item itemToInsert = Item.builder()
                .amount(itemDTO.getAmount())
                .marketBag(marketBag)
                .product(productRepository.findById(itemDTO.getProductId()).orElseThrow(
                                ()->{ throw new RuntimeException("This Product does not exist");}
                        )
                )
                .build();

        if(bagItens.isEmpty()){
            bagItens.add(itemToInsert);
        }

        return ;
    }
}
