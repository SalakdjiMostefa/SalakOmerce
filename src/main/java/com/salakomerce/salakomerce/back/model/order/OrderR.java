package com.salakomerce.salakomerce.back.model.order;


import com.salakomerce.salakomerce.back.model.cartlines.CartLine;
import com.salakomerce.salakomerce.back.model.customer.Customer;
import com.salakomerce.salakomerce.back.model.modelivraison.ModeLivraison;
import com.salakomerce.salakomerce.back.model.modepayment.ModePayment;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDERR")
public class OrderR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    @Column(name = "dateCreation")
    private String dateCreation;
    @Column(name = "statusOrder")
    private String statusOrder;
    @Column(name = "statusPayment")
    private String statusPayment;
    @OneToMany
    @JoinColumn(name = "cartLines")
    private List<CartLine> cartLines;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mode_payment_id")
    private ModePayment modePayment;
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

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public String getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(String statusPayment) {
        this.statusPayment = statusPayment;
    }

    public ModePayment getModePayment() {
        return modePayment;
    }

    public void setModePayment(ModePayment modePayment) {
        this.modePayment = modePayment;
    }

    public ModeLivraison getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison(ModeLivraison modeLivraison) {
        this.modeLivraison = modeLivraison;
    }
}
