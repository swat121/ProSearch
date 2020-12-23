package com.example.MVC.repository;

import com.example.MVC.models.images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<images, Long> {
}
