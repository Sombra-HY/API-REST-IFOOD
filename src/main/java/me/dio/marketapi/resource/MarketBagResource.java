package me.dio.marketapi.resource;

import lombok.RequiredArgsConstructor;
import me.dio.marketapi.model.Item;
import me.dio.marketapi.model.MarketBag;
import me.dio.marketapi.resource.dto.ItemDTO;
import me.dio.marketapi.services.MarketBagService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/marketbag")
@RequiredArgsConstructor
public class MarketBagResource   {
    private final MarketBagService marketBagService;
    @PostMapping
    public Item addMarketBag(@RequestBody ItemDTO itemDTO) { return marketBagService.addMarketBag(itemDTO);}
    @GetMapping("{/id}")
    public MarketBag showMarketBag(@PathVariable("id") long idMarketbag){ return marketBagService.showMarketBag(idMarketbag);}
    @PatchMapping("closeMarketBag/{idMarketbag}")
    public MarketBag closeMarketBag( @PathVariable("idMarketbag") long idMarketbag,
                                     @RequestParam("methodPay") int methodPay){
        return marketBagService.closeMarketBag(idMarketbag, methodPay);
    }
}
