package com.hexagon.ddd.domain.user;

import java.util.UUID;

public class User {

  private UUID id;
  private String name;
  private String email;
  private String password;
  private boolean status;

  public User(){}

  public User(Builder builder){
    this.id = UUID.randomUUID();
    this.name = builder.name;
    this.email = builder.email;
    this.password = builder.password;
    this.status = builder.status;
  }

  class Builder{

    private String name;
    private String email;
    private String password;
    private boolean status;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public Builder status(boolean status) {
      this.status = status;
      return this;
    }

    public User build(){
      return new User(this);
    }
    
  }
}
