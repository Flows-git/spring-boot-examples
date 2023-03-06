package com.flowdamic.examples.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AliveController {
  

  @GetMapping("/")
  public String isAlive() {
    return "I'm alive!";
  }
}
