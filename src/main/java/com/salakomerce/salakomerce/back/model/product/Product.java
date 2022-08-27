package com.salakomerce.salakomerce.back.model.product;

import com.salakomerce.salakomerce.back.model.album.Album;
import com.salakomerce.salakomerce.back.model.category.Category;
import com.salakomerce.salakomerce.back.model.price.Price;
import com.salakomerce.salakomerce.back.model.stock.Stock;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prices")
    private List<Price> prices;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
//    @OneToOne
//    @JoinColumn(name = "album_id", nullable = false)
//    private Album album;
//    @OneToOne
//    @JoinColumn(name = "stock_id", nullable = false)
//    private Stock stock;

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

    public List<Price> getPrice() {
        return prices;
    }

    public void setPrice(List<Price> prices) {
        this.prices = prices;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prices=" + prices +
                ", category=" + category.getId() +
                '}';
    }
}
