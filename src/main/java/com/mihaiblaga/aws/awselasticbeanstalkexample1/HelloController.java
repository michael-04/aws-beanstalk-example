package com.mihaiblaga.aws.awselasticbeanstalkexample1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

  public  String hello(){
    return "Hello AWS";
  }
}
