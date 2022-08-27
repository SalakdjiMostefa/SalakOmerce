package com.salakomerce.salakomerce.back.model.picture;

import com.salakomerce.salakomerce.back.model.album.Album;

import javax.persistence.*;

@Entity
@Table(name = "PICTURE")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "url")
    private String url;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "album_id", nullable = false)
    private Album album;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
