package com.springproject.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
