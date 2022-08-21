package com.Tablica.grupa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class GrupaController {
    @Autowired
    GrupaRepository grupaRepository;

    private Gson gson = new GsonBuilder().create();

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String test(){
        //grupaRepository.save(new Grupa(2,"test"));
        //System.out.println("test");
        return gson.toJson("Test");
    }
}
