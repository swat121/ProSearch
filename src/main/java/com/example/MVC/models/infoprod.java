package com.example.MVC.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class infoprod {



    @Id
    private Long code;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="code")
//    private images images;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private String color;



    @Column
    private String size;

    @Column
    private boolean availability;

    @Column
    private String country;


    @Column
    private String brand;

    @Column
    private int x ;

    @Column
    private int y ;

    @Column
    private String img;

    @Column
    private String dept;


//    public com.example.MVC.models.images getImages() {
//        return images;
//    }
//
//    public void setImages(com.example.MVC.models.images images) {
//        this.images = images;
//    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
