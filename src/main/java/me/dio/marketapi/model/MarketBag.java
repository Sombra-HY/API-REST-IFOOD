package me.dio.marketapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.marketapi.enumeratrion.PaymentMethod;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@NoArgsConstructor
public class MarketBag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Client client;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> bagItens;
    private Double priceTotal;
    @Enumerated
    private PaymentMethod iPaymentMethod;
    private boolean isbagClose;

}

