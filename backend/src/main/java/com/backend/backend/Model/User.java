package com.backend.backend.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id// 主鍵由數據庫自動維護(AUTO_INCREMENT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "U_ID")
    private Long U_ID;
    @Column(name = "Account")
    private String Account;
    @Column(name = "Password")
    private String Password;
    @Column(name = "Name")
    private String Name;
    @Column(name = "G_ID")
    private Long G_ID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getU_ID() {
        return U_ID;
    }

    public void setU_ID(Long u_ID) {
        U_ID = u_ID;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Long getG_ID() {
        return G_ID;
    }

    public void setG_ID(Long g_ID) {
        G_ID = g_ID;
    }


}
