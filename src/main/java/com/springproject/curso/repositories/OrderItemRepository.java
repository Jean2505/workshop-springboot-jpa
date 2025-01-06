package com.springproject.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
