package com.salakomerce.salakomerce.back.model.cartlines;

import com.salakomerce.salakomerce.back.model.cart.Cart;
import com.salakomerce.salakomerce.back.model.order.OrderR;
import com.salakomerce.salakomerce.back.model.product.Product;

import javax.persistence.*;

@Entity
@Table(name = "CARTLINE")
public class CartLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;
    @Column(name = "qty")
    private int qty;
    @Column(name = "totalPrice")
    private double totalPrice;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderR order;
    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderR getOrder() {
        return order;
    }

    public void setOrder(OrderR order) {
        this.order = order;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
