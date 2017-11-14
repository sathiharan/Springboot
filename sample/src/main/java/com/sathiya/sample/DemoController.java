package com.sathiya.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/helloworld")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Hello World! SpringBoot");
    }
}
