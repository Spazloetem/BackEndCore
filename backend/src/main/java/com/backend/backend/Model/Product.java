package com.backend.backend.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="product")
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id// 主鍵由數據庫自動維護(AUTO_INCREMENT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "P_ID")
    private Long P_ID;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Price")
    private Integer Price;

    public Long getP_ID() {
        return P_ID;
    }

    public void setP_ID(Long p_ID) {
        P_ID = p_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

}
