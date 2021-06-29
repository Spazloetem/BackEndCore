package com.backend.backend.DataBaseaccessObject;

import com.backend.backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface D_User extends JpaRepository<User, Long> {
    @Query(value = "select * from user where Account = ?1", nativeQuery=true)
    User getAccount(String Account);
}
