package com.example.crud.domain.product;


import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name="project")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    private String name;

    private Integer price_in_cents;

    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice_in_cents(Integer price_in_cents) {
        this.price_in_cents = price_in_cents;
    }


}
