/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.ciclo4.modelo;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author HeerJHobby
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "footwears")
public class Accessory {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String material;
    private String gender;
    private String size;
    private String description;
    private Boolean availability = true;
    private Double price;
    private Integer quantity;
    private String photography;
}

