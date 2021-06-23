package com.backend.backend.control;

import com.backend.backend.module.User.InsertUser;
import com.backend.backend.object.User.User;
import com.backend.backend.systemtool.ModifyDataResult;
import com.backend.backend.systemtool.NonSelect_Interface;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class C_User {
    @PostMapping("/insertusers")
    public ResponseEntity<ModifyDataResult<Integer>> insertProducts(@RequestBody User request) throws Exception {
        NonSelect_Interface<ModifyDataResult<Integer>> result = new InsertUser(request);
        return ResponseEntity.ok().body(result.GetResult());
    }
}
