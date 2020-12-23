package com.example.MVC.repository;

import com.example.MVC.models.infoprod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdRepository  extends JpaRepository<infoprod, Long> {
    List<infoprod> findAllByName(String name);
}
