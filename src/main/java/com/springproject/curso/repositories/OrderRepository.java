package com.springproject.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
