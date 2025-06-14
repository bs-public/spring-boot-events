package com.app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public String createUser(@RequestBody UserRequest request) {
    userService.createUser(request.name());
    return "User created: " + request.name();
  }
}
