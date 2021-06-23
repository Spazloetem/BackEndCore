package com.backend.backend.databaseaccessobject;

import com.backend.backend.databaseaccessobject.User.DAO_InsertUser;

public class DAO_Factory {
    private DAO_InsertUser DAO_InsertUser;

    public static DAO_Factory Statis_Factory = null;
    private static final Object syncRoot = new Object();

    public static DAO_Factory GetInstance() {
        if (Statis_Factory == null) {
            synchronized (syncRoot) {
                if (Statis_Factory == null)
                    Statis_Factory = new DAO_Factory();
            }
        }
        return Statis_Factory;
    }
    private DAO_Factory() {
        DAO_InsertUser = new DAO_InsertUser();
    }
    public DAO_InsertUser getDAO_InsertUser() {
        return DAO_InsertUser;
    }
}
