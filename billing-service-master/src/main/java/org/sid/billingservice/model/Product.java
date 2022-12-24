package org.sid.billingservice.model;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String nom;
    private double price;
    private double quantity;


}
