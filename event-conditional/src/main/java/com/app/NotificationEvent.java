package com.app;

public class NotificationEvent {
  private final String message;
  private final String type; // "admin" or "user"

  public NotificationEvent(String message, String type) {
    this.message = message;
    this.type = type;
  }

  public String getMessage() {
    return message;
  }

  public String getType() {
    return type;
  }
}
