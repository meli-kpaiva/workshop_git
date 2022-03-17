package com.kzuluaga.workshop_git;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MainController {

    @GetMapping
    public ResponseEntity<String> getMEssage(){

        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }
}
