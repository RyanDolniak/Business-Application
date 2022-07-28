package Dolniak.business.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id=pk")
    private Integer id;
    private Integer product;
    private Integer customer;
    private Integer quantity;
    private Boolean delivered;
}
