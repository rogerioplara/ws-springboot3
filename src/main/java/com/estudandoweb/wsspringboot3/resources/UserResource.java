package com.estudandoweb.wsspringboot3.resources;

import com.estudandoweb.wsspringboot3.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "99999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
