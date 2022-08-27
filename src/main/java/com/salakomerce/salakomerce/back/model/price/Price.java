package com.salakomerce.salakomerce.back.model.price;

import com.salakomerce.salakomerce.back.model.discount.Discount;
import com.salakomerce.salakomerce.back.model.modelivraison.ModeLivraison;
import com.salakomerce.salakomerce.back.model.product.Product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRICE")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "currentPrice")
    private double currentPrice;
    @Column(name = "oldPrice")
    private double oldPrice;
    @OneToMany(mappedBy = "price")
    private List<Discount> discounts;
    @Column(name = "startDate")
    private String startDate;
    @Column(name = "endDate")
    private String endDate;
    @ManyToOne
    private Product product;
    @ManyToOne
    private ModeLivraison modeLivraison;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
