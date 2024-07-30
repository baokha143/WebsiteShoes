package com.lab.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.Entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{

}
