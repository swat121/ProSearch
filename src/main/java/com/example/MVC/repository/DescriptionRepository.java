package com.example.MVC.repository;

import com.example.MVC.models.description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DescriptionRepository extends Repository<description, String> {
    Optional<description> findAllByCode(double code);
}
