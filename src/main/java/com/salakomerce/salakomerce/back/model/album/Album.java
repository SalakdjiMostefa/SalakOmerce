package com.salakomerce.salakomerce.back.model.album;

import com.salakomerce.salakomerce.back.model.category.Category;
import com.salakomerce.salakomerce.back.model.picture.Picture;
import com.salakomerce.salakomerce.back.model.product.Product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ALBUM")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pictures")
    private List<Picture> pictures;
    @OneToOne
    private Product product;

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

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }


}
