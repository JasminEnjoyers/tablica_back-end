package com.Tablica.grupa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrupaController {
    @Autowired
    GrupaRepository grupaRepository;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void test(){
        // do zmiany
        grupaRepository.save(new Grupa(2,"test"));
        System.out.println("test");
    }
}
