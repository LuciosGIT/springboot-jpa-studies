package com.estudos.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.courseNelio.entities.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {

}
