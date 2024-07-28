package com.estudos.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.courseNelio.entities.OrderItem;
import com.estudos.courseNelio.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
