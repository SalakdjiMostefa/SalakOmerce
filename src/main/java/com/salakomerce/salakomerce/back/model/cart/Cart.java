package com.salakomerce.salakomerce.back.model.cart;

import com.salakomerce.salakomerce.back.model.cartlines.CartLine;
import com.salakomerce.salakomerce.back.model.customer.Customer;
import com.salakomerce.salakomerce.back.model.modelivraison.ModeLivraison;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CART")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    @JoinColumn(name = "customerid")
    private Customer customer;
    @OneToMany(mappedBy = "cart")
    private List<CartLine> cartLines;
    @Column(name = "dateCreation")
    private String dateCreation;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mode_livraison_id")
    private ModeLivraison modeLivraison;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<CartLine> getCartLines() {
        return cartLines;
    }

    public void setCartLines(List<CartLine> cartLines) {
        this.cartLines = cartLines;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public ModeLivraison getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison(ModeLivraison modeLivraison) {
        this.modeLivraison = modeLivraison;
    }
}
