package com.salakomerce.salakomerce.back.model.modepayment;

import com.salakomerce.salakomerce.back.model.order.OrderR;

import javax.persistence.*;

@Entity
@Table(name = "MODEPAYMENT")
public class ModePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToOne
    private OrderR orderR;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
