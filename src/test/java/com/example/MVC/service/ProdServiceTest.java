package com.example.MVC.service;

import com.example.MVC.models.infoprod;
import com.example.MVC.repository.ProdRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProdServiceTest {
    @Autowired
    private ProdRepository prodRepository;
    @Autowired
    private ProdService prodService;

    @MockBean
   private Model model;

    @MockBean
    private BindingResult bindingResult;

    @MockBean
    private infoprod infoprod;

    @Test
    void prodDetails() {
        long code = 41;
        String s = prodService.prodDetails(code,model);
        Assert.assertEquals("details", s);
    }

    @Test
    void findProd() {

        String name="Умивальник";

        String s = prodService.findProd(infoprod,bindingResult,name,model);
        Assert.assertEquals("find", s);
//        infoprod infoprod= new infoprod();
//        infoprod.setName("Умивальник");
//        Mockito.doReturn(infoprod).when(prodRepository).findAllByName("Умивальник");
//
//        String s = prodService.findProd(infoprod,bindingResult,name,model);
//        Assert.assertEquals("find", s);
    }

    @Test
    void info(){
        long code = 45;
        String s = prodService.prodDetails(code,model);
        Assert.assertEquals("details", s);
    }
}