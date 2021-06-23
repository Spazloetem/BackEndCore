package com.backend.backend.database;

import com.backend.backend.database.table.DB_User;

public class DB_Factory {
    private DB_User DB_User;

    public static DB_Factory Statis_Factory = null;
    private static final Object syncRoot = new Object();

    public static DB_Factory GetInstance() {
        if (Statis_Factory == null) {
            synchronized (syncRoot) {
                if (Statis_Factory == null)
                    Statis_Factory = new DB_Factory();
            }
        }
        return Statis_Factory;
    }
    private DB_Factory() {
        DB_User = new DB_User();
    }
    public DB_User getDB_User() {
        return DB_User;
    }
}
