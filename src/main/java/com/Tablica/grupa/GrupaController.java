package com.Tablica.grupa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class GrupaController {
    @Autowired
    GrupaRepository grupaRepository;

    private Gson gson = new GsonBuilder().create();

    /*
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String test(){
        List<String> slowa = new ArrayList<>();
        slowa.add("Test");
        slowa.add("test2");
        return gson.toJson(slowa);
    }
     */
}
