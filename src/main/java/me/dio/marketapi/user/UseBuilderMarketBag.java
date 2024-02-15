package me.dio.marketapi.user;

import me.dio.marketapi.enumeratrion.PaymentMethod;
import me.dio.marketapi.model.Client;
import me.dio.marketapi.Interface.IBuilderMarketBag;
import me.dio.marketapi.model.Item;
import me.dio.marketapi.model.MarketBag;

public class UseBuilderMarketBag implements IBuilderMarketBag {
    private MarketBag market;


    @Override
    public IBuilderMarketBag isbagClose(boolean stateBag) {
        market.setIsbagClose(stateBag);
        return this;
    }

    @Override
    public IBuilderMarketBag iPaymentMethod(PaymentMethod paymentMethod) {
        market.setIPaymentMethod(paymentMethod);
        return this;
    }

    @Override
    public IBuilderMarketBag bagItens(Item item) {
        market.getBagItens().add(item);
        return this;
    }

    @Override
    public IBuilderMarketBag client(Client client) {
        market.setClient(client);
        return this;
    }

    @Override
    public IBuilderMarketBag id(long id) {
        market.setId(id);
        return this;
    }

    @Override
    public Double priceTotal() {
        return null;
    }

    public MarketBag build() {
        return market;
    }

}
