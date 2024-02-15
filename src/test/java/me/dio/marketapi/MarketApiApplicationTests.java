package me.dio.marketapi;

import me.dio.marketapi.Interface.IBuilderMarketBag;
import me.dio.marketapi.user.UseBuilderMarketBag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MarketApiApplicationTests {

	@Test
	void contextLoads() {
		IBuilderMarketBag MarketB = new UseBuilderMarketBag();
	}

}
