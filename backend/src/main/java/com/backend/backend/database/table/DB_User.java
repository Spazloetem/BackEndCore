package com.backend.backend.database.table;

import com.backend.backend.database.JpaConfig;
import com.backend.backend.object.User.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class DB_User {
    JdbcTemplate jdbcTemplate;
    public DB_User(){
        jdbcTemplate = new JdbcTemplate(new JpaConfig().MySqlDataSource());
    }

    public Integer DB_InsertUser(User User){
        String sql = "INSERT INTO DB_User(Account, Password) VALUES (?,?)";
        Integer results = jdbcTemplate.update(sql,User.getAccount(),User.getPassword());
        return results;
    }

}
