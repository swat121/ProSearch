package com.example.MVC.service;


import com.example.MVC.models.infoprod;

import com.example.MVC.repository.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class FruitService {


//
//    @Autowired
//    private final ProdRepository prodRepository;

//    public FruitService(FruitsRepository fruitsRepository, ProdRepository prodRepository){
//        this.fruitsRepository = fruitsRepository;
//        this.prodRepository = prodRepository;
//    }
//
//    public void createFruit(fruits fruit){
//        fruitsRepository.save(fruit);
//    }
//
//    public List<fruits> findAll(){
//        return fruitsRepository.findAll();
//    }

//    public List<fruits> findAllByName(String name){
//        return fruitsRepository.findAllByName(name);
//    }

}
