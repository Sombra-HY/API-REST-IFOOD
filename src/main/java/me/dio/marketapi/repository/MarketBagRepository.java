package me.dio.marketapi.repository;

import me.dio.marketapi.model.MarketBag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MarketBagRepository extends JpaRepository<MarketBag,Long> {
}
