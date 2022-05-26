package ru.job4j.mapping.cars_drivers.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ads", schema = "cars")
public class Ads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_brand")
    private String  carBrand;

    @Column(name = "body_type")
    private String bodyType;

    @Column(name = "photo_link")
    private String photoLink;

    @ManyToOne()
    @JoinColumn(name = "author_email")
    private User author;

    @Column(name = "state")
    private AdsState state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public AdsState getState() {
        return state;
    }

    public void setState(AdsState state) {
        this.state = state;
    }
}
