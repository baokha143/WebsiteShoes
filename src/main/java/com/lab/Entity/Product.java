package com.lab.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "image", length = 500)
    private String image;

    @Column(name = "price")
    private Float price;

    @Column(name = "title", length = 500)
    private String title;

    @Column(name = "description", length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "cateID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "sell_ID")
    private Account seller;

    @Column(name = "model", length = 50)
    private String model;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "delivery", length = 50)
    private String delivery;

    @Column(name = "image2", length = 500)
    private String image2;

    @Column(name = "image3", length = 500)
    private String image3;

    @Column(name = "image4", length = 500)
    private String image4;

    @Column(name = "sizes", length = 100)
    private String sizes; // Kích thước có sẵn, ví dụ: "38,39,41,42"

    @Column(name = "stock")
    private Integer stock; // Số lượng tồn kho

    @Column(name = "discount")
    private Float discount; // Giảm giá

    @Column(name = "averageRating")
    private Float averageRating; // Đánh giá trung bình

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}