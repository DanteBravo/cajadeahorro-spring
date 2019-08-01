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
    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
