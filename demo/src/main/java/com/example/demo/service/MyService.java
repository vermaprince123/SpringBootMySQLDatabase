package com.example.demo.service;

import com.example.demo.product.Product;
import com.example.demo.repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Optional;

@Service
public class MyService {

   @Autowired
    MyRepo myRepo;

   public List<Product> getAll(){
       return myRepo.findAll();
   }

    public void saveProduct(Product product){
       myRepo.save(product);
    }

    public Optional<Product> getById(@PathVariable String id){

       return myRepo.findById(id);
    }
    public void delete(@PathVariable String id){
       myRepo.deleteById(id);
    }

    public void deleteAll(){
       myRepo.deleteAll();
    }
}
