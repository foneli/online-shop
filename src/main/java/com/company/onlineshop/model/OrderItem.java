package com.company.onlineshop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_item")
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "price", nullable = false)
    private double price;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;
}
