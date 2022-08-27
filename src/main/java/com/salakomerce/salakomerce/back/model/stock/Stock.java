package com.salakomerce.salakomerce.back.model.stock;

import com.salakomerce.salakomerce.back.model.product.Product;

import javax.persistence.*;

@Entity
@Table(name = "STOCK")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "available")
    private int available;
    @Column(name = "reserved")
    private int reserved;
    @OneToOne
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }


}
