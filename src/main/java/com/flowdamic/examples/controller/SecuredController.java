package com.flowdamic.examples.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured")
public class SecuredController {

  @GetMapping
  public String isSecured() {
    return "I'm secured!";
  }

  @PreAuthorize("hasRole('user')")
  @GetMapping("/user")
  public String isUser() {
    return "I'm user content!";
  }

  @PreAuthorize("hasRole('admin')")
  @GetMapping("/admin")
  public String isAdmin() {
    return "I'm admin content!";
  }
}
