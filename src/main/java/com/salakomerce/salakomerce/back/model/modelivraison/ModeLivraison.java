package com.salakomerce.salakomerce.back.model.modelivraison;

import com.salakomerce.salakomerce.back.model.cart.Cart;
import com.salakomerce.salakomerce.back.model.price.Price;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MODELIVRAISON")
public class ModeLivraison {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prices")
    private List<Price> prices;
    @OneToOne
    private Cart cart;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
