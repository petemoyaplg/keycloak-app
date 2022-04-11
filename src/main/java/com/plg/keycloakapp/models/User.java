package com.plg.keycloakapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
  private int id;
  private String name;
  private String email;
  private String phoneNumber;
}
