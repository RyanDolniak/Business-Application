package Dolniak.business.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id=pk")
    private Integer id;
    @Column(name="product_name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="inventory")
    private String inventory;
    @Column(name="cost")
    private Double cost;

}
