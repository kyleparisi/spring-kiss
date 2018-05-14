package com.example.springkiss;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @RequestMapping("/hello/{param}")
    public ResponseEntity<String> StatusOk(@PathVariable String param) {
        return new ResponseEntity<>("Hello " + param, new HttpHeaders(), HttpStatus.OK);
    }
}
