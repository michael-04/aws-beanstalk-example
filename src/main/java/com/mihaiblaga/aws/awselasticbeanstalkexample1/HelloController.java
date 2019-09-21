package com.mihaiblaga.aws.awselasticbeanstalkexample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

  @GetMapping
  public  String hello(){
    return "Hello AWS";
  }
}
