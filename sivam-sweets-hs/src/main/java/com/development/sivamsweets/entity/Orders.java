package com.development.sivamsweets.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue
    private int order_id;

    private String customer_name;
    private String customer_mobile;
    private String customer_address;

    //quantity of each item
    private int rava_laddu;
    private int peanut_laddu;
    private int sesame_laddu;
    private int mysore_pak;
    private int ghee_mysore_pak;
    private int cashew_cake;
    private int coconut_burfi;

}
