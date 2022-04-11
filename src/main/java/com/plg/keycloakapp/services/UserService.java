package com.plg.keycloakapp.services;

import java.util.ArrayList;
import java.util.List;

import com.plg.keycloakapp.models.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  public List<User> getUsers() {
    List<User> users = new ArrayList<>();

    users.add(new User(1, "Gaspard1", "gaspard1@mail.com", "+243817255001"));
    users.add(new User(2, "Gaspard2", "gaspard2@mail.com", "+243817255002"));
    users.add(new User(3, "Gaspard3", "gaspard3@mail.com", "+243817255003"));
    users.add(new User(4, "Gaspard4", "gaspard4@mail.com", "+243817255004"));
    users.add(new User(5, "Gaspard5", "gaspard5@mail.com", "+243817255005"));

    return users;
  }
}
