package com.kzuluaga.workshop_git.controller;

import com.kzuluaga.workshop_git.service.MainService;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MainController {

    private MainService mainService;

    @Autowired
    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping
    public ResponseEntity<String> getMessage(@RequestParam(name = "value") String value){

        HttpHeaders headers = new HttpHeaders();

        if (mainService.checkString(value)){
            return new ResponseEntity("Successfully", headers, HttpStatus.CREATED);
        } else {
            return new ResponseEntity("Successfully", headers, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<String> createMessage(){

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> changeMessage(){

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteMessage(){

        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteMessage1(){

        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteMessage2(){

        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity("Successfully", headers, HttpStatus.OK);
    }
}
