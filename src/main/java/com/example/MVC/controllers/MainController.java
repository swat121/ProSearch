package com.example.MVC.controllers;



import com.example.MVC.models.description;
import com.example.MVC.models.images;
import com.example.MVC.models.infoprod;

import com.example.MVC.repository.DescriptionRepository;
import com.example.MVC.repository.ImageRepository;
import com.example.MVC.repository.ProdRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private DescriptionRepository descriptionRepository;
    @Autowired
    private ProdRepository prodRepository;
    @Autowired
    private ImageRepository imageRepository;


    @GetMapping("/find")
    public String find(  Model model, infoprod infoprod){
        return "find";
    }

    @PostMapping("/find")
    public String findProduct(@Valid @ModelAttribute("infoprod") infoprod infoprod, BindingResult bindingResult, Model model, @RequestParam String name){
        List<infoprod> info_prods = prodRepository.findAllByName(name);
        if(info_prods.isEmpty()){
            bindingResult.addError(new FieldError("infoprod","name","Даный товар відсутній або невірно вказана назва"));
            return "find";
        }
        else {
            model.addAttribute("product", info_prods);
            return "find";
        }


    }


    @GetMapping("/find/{code}")
    public String blogDetails(@PathVariable(value = "code") long code, Model model){
        if(!prodRepository.existsById(code)){
            return "find";
        }
        Optional<infoprod> infoprod = prodRepository.findById(code);
        Optional<images> images = imageRepository.findById(code);
        Optional<description> description = descriptionRepository.findAllByCode(code);
        ArrayList<images> resImg = new ArrayList<>();
        ArrayList<description> resDes = new ArrayList<>();
        ArrayList<infoprod> resProd = new ArrayList<>();
        description.ifPresent(resDes::add);
        infoprod.ifPresent(resProd::add);
        images.ifPresent(resImg::add);
        model.addAttribute("detail", resProd);
        model.addAttribute("images",resImg);
        model.addAttribute("about", resDes);
        return "details";
    }
}
