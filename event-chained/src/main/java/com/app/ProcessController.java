package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {
  private final ProcessService service;

  public ProcessController(ProcessService service) {
    this.service = service;
  }

  @PostMapping
  public String createUser(@RequestBody ProcessRequest request) {
    return service.startProcess(request.payload());
  }
}
