package com.company.onlineshop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "delivery")
@Data
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "delivery_date", nullable = false)
    private LocalDate deliveryDate;

    @OneToOne
    @JoinColumn(name = "order_id", unique = true)
    private Orders orders;

    }