package com.backend.backend.databaseaccessobject.User;

import com.backend.backend.database.DB_Factory;
import com.backend.backend.object.User.User;
public class DAO_InsertUser {
    public Integer DAO_InsertUser(User User) throws Exception {
        return DB_Factory.GetInstance().getDB_User().DB_InsertUser(User);
    }
}
