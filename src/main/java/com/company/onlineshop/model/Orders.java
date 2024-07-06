package com.company.onlineshop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "totalPrice", nullable = false)
    private String totalPrice;

    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Delivery delivery;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    }