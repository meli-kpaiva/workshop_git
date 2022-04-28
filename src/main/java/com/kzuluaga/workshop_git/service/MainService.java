package com.kzuluaga.workshop_git.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    private final String NEW = "NEW";
    public boolean checkString(String value){
        return !value.isEmpty() && value.equals(NEW);
    }
    public String checkNamingConvention(String value){
        return value;
    }
}
