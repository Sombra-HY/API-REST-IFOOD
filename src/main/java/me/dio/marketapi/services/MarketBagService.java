package me.dio.marketapi.services;

import lombok.RequiredArgsConstructor;
import me.dio.marketapi.model.Item;
import me.dio.marketapi.model.MarketBag;
import me.dio.marketapi.repository.MarketBagRepository;
import me.dio.marketapi.resource.dto.ItemDTO;
import org.springframework.stereotype.Service;


public interface MarketBagService {

    MarketBag  showMarketBag(long IdMarketBag);
    MarketBag  closeMarketBag(long IdMarketBag, int payMethod);
    Item  addMarketBag(ItemDTO itemDTO);
}
