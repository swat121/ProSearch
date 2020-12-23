package com.example.MVC.models;


import javax.persistence.*;

@Entity
@Table
public class images {


    @Id
    private Long code;

//    @OneToOne(mappedBy = "code",cascade = CascadeType.ALL)
//    private infoprod infoprod;

    @Column
    private String imageprod;

    @Column
    private String imagepath;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getImageprod() {
        return imageprod;
    }

    public void setImageprod(String imageprod) {
        this.imageprod = imageprod;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
//    public com.example.MVC.models.infoprod getInfoprod() {
//        return infoprod;
//    }
//
//    public void setInfoprod(com.example.MVC.models.infoprod infoprod) {
//        this.infoprod = infoprod;
//    }
}
