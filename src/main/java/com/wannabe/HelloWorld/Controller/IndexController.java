package com.wannabe.HelloWorld.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {

  @GetMapping("/v1/greet")
  public ResponseEntity<?> greeting() {
    return ResponseEntity.ok("Request success !");
  }

  @GetMapping("/v2/greet")
  public ResponseEntity<?> greetingV2() {

    return ResponseEntity.ok("Request v2 success !");
  }
}
