package com.salakomerce.salakomerce.back.model.category;

import com.salakomerce.salakomerce.back.model.album.Album;
import com.salakomerce.salakomerce.back.model.product.Product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORY")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> products;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + getProducts() +
                '}';
    }
}
