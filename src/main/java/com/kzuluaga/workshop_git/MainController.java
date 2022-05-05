package com.kzuluaga.workshop_git;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MainController {

    @GetMapping
    public ResponseEntity<String> getMessage(){

        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createMessage(){

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> changeMessageByID(){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<String> edit(){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }
}
