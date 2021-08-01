package com.backend.backend.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="group_t")
@EntityListeners(AuditingEntityListener.class)
public class Group {

    @Id// 主鍵由數據庫自動維護(AUTO_INCREMENT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "G_ID")
    private Long G_ID;
    @Column(name = "GroupName")
    private String GroupName;
    @Column(name = "A_ID")
    private Long A_ID;

    public Long getG_ID() {
        return G_ID;
    }

    public void setG_ID(Long g_ID) {
        G_ID = g_ID;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public Long getA_ID() {
        return A_ID;
    }

    public void setA_ID(Long a_ID) {
        A_ID = a_ID;
    }
}
