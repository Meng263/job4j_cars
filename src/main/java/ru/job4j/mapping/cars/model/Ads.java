package ru.job4j.mapping.cars.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ads", schema = "cars")
public class Ads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @Column(name = "photo_link")
    private String photoLink;

    @ManyToOne()
    @JoinColumn(name = "author_email")
    private User author;

    @Column(name = "state")
    private AdsState state;

    @ManyToOne()
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public AdsState getState() {
        return state;
    }

    public void setState(AdsState state) {
        this.state = state;
    }
}
