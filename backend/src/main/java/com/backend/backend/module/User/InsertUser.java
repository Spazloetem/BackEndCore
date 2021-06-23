package com.backend.backend.module.User;

import com.backend.backend.databaseaccessobject.DAO_Factory;
import com.backend.backend.object.User.User;
import com.backend.backend.systemtool.ModifyDataResult;
import com.backend.backend.systemtool.NonSelect_Interface;

public class InsertUser implements NonSelect_Interface<ModifyDataResult<Integer>> {
    private User user;

    public InsertUser(User _user){
        user = _user;
    }

    @Override
    public ModifyDataResult<Integer> GetResult() throws Exception {
        ModifyDataResult<Integer> result = new ModifyDataResult<Integer>();
        Integer DB_result = DAO_Factory.GetInstance().getDAO_InsertUser().DAO_InsertUser(user);
        if(DB_result > 0){
            result.setUpDateStatus("SUCCESS");
            result.setUpDateMsg("");
            result.getResultList().add(DB_result);
        }else{
            result.setUpDateStatus("FAIL");
            result.setUpDateMsg("");
        }
        return result;
    }
}
