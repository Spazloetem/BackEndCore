package com.backend.backend.Control;


import com.backend.backend.Model.User;
import com.backend.backend.Service.S_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class C_User {
    @Autowired
    private S_User ServiceUser;

    @GetMapping("/{id}")//查詢
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        User user = ServiceUser.getUser(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping//建立
    public ResponseEntity<User> createUser(@RequestBody User request) {
        User user = ServiceUser.createUser(request);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getU_ID())
                .toUri();
        return ResponseEntity.created(location).body(user);
    }

    @PutMapping//修改
    public ResponseEntity<User> replaceUser(@RequestBody User request) {
        User user = ServiceUser.replaceUser(request);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
        ServiceUser.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
