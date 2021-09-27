package com.example.demo.controller;

import com.example.demo.product.Product;
import com.example.demo.service.MyService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @PostMapping("/addProduct")
    public void addP(@RequestBody Product product){
        myService.saveProduct(product);
    }

    @GetMapping("/getAll")
    public List<Product> get(){
        return myService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<Product> getByI(@PathVariable String id){
        return myService.getById(id);
    }


    @DeleteMapping("/deleteById/{id}")
    public void deleteP(@PathVariable String id){
        myService.delete(id);
    }
    @DeleteMapping("/deleteAll")
    public void deleteA(){
        myService.deleteAll();
    }
}
