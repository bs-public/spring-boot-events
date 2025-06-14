package com.app;

// type: "admin" or "user"
public record NotificationEvent(String message, String type) {}
