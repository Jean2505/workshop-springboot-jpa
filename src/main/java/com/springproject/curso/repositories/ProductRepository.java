package com.springproject.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
