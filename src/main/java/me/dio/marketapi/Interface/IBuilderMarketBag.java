package me.dio.marketapi.Interface;

import me.dio.marketapi.enumeratrion.PaymentMethod;
import me.dio.marketapi.model.Client;
import me.dio.marketapi.model.Item;
import me.dio.marketapi.model.MarketBag;

public interface IBuilderMarketBag {

    MarketBag build();

    IBuilderMarketBag isbagClose(boolean stateBag);

    IBuilderMarketBag iPaymentMethod(PaymentMethod paymentMethod);

    IBuilderMarketBag bagItens(Item item);

    IBuilderMarketBag client(Client client);

    IBuilderMarketBag id(long id);

     Double priceTotal();


}
