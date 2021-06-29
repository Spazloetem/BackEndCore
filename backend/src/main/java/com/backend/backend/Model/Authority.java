package com.backend.backend.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="authority")
@EntityListeners(AuditingEntityListener.class)
public class Authority {

    @Id// 主鍵由數據庫自動維護(AUTO_INCREMENT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "A_ID")
    private Integer A_ID;
    @Column(name = "Authority")
    private String Authority;

    public Integer getA_ID() {
        return A_ID;
    }

    public void setA_ID(Integer a_ID) {
        A_ID = a_ID;
    }

    public String getAuthority() {
        return Authority;
    }

    public void setAuthority(String authority) {
        Authority = authority;
    }


}
