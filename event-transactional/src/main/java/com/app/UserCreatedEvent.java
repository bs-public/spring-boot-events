package com.app;

public class UserCreatedEvent {
  private final String userName;

  public UserCreatedEvent(String userName) {
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }
}
