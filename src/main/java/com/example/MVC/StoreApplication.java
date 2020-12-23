package com.example.MVC;


import com.example.MVC.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class StoreApplication {

    @Autowired
    FruitService fruitService;

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods(){
//        fruits fruit1 = new fruits();
//        fruit1.setName("Tomato");
//        fruit1.setPrice("19");
//        fruitService.createFruit(fruit1);
//        fruits fruit2 = new fruits();
//        fruit2.setName("Potatoes");
//        fruit2.setPrice("24");
//        fruitService.createFruit(fruit2);


        //fruitService.findAll().forEach(it-> System.out.println(it));
     //  fruitService.findAllByName("Pitatoes").forEach(it-> System.out.println(it));


    }
}
