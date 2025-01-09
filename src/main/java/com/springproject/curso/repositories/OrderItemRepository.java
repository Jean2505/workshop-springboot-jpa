package com.springproject.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.curso.entities.OrderItem;
import com.springproject.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
