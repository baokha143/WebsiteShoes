package com.lab.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.Entity.Review;

public interface ReviewDAO extends JpaRepository<Review, Integer>{

}
