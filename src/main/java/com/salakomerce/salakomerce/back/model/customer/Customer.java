package com.salakomerce.salakomerce.back.model.customer;

import com.salakomerce.salakomerce.back.model.adresse.Adresse;
import com.salakomerce.salakomerce.back.model.cart.Cart;
import com.salakomerce.salakomerce.back.model.order.OrderR;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CUSTOMER")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "psword")
    private String psword;
    @OneToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;
    @OneToMany(mappedBy = "customer")
    private List<OrderR> orders;
    @OneToMany(mappedBy = "customer")
    private List<Adresse> adresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPsword() {
        return psword;
    }

    public void setPsword(String psword) {
        this.psword = psword;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<OrderR> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderR> orders) {
        this.orders = orders;
    }

    public List<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }
}
