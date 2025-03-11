package com.esraa.springdatarestdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Scope("prototype")
@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private Long id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "mm-dd-yyyy")
    private Date releaseDate;
    private boolean available;
    private int quantity;

    //Image Data
    private String imageName;
    private String imageType;
    @Lob
    private byte[] image;


    public Product(long id)
    {
        this.id = id;
    }

}
