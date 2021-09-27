package com.example.demo.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Product {

     @Id
     private String id;
     private String name;

}
