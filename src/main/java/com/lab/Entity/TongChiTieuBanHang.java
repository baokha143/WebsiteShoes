package com.lab.Entity;

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
@Table(name = "TongChiTieuBanHang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TongChiTieuBanHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    @Column(name = "TongChiTieu")
    private Integer tongChiTieu;

    @Column(name = "TongBanHang")
    private Integer tongBanHang;

    @ManyToOne
    @JoinColumn(name = "userID", insertable = false, updatable = false)
    private Account user;
}