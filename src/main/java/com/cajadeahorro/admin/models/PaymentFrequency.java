package com.cajadeahorro.admin.models;

import com.cajadeahorro.admin.enums.PaymentEnum;

import javax.persistence.*;

@Entity
@Table(name = "payment_frequencies")
public class PaymentFrequency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private PaymentEnum name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PaymentEnum getName() {
        return name;
    }

    public void setName(PaymentEnum name) {
        this.name = name;
    }
}
