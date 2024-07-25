package com.estudos.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.courseNelio.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
