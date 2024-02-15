package me.dio.marketapi.repository;

import me.dio.marketapi.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RestauranttRepository extends JpaRepository<Restaurant,Long> {

}
