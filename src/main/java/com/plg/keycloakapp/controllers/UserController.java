package com.plg.keycloakapp.controllers;

import java.util.List;

import com.plg.keycloakapp.models.User;
import com.plg.keycloakapp.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("users")
  public List<User> getAllUser() {
    return this.userService.getUsers();
  }
}
