package com.webdynamo.ecom_prj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String desc;
    private String brand;
    private double price;
    private String category;
    private Date releaseDate;
    private int qty;
    private boolean available;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageDate;
}