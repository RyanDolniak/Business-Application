package Dolniak.business.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pk")
    private Integer id;
    private String name;
    private String street;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private String orders;
    private String satisfaction;
}
