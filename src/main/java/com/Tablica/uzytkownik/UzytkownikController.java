package com.Tablica.uzytkownik;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
public class UzytkownikController {

    private Gson gson = new GsonBuilder().create();

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String checkUserDetails(
            @RequestParam String login,
            @RequestParam String password
    ){
        System.out.println(login);
        System.out.println(password);

        //zwroc tutaj usera
        return gson.toJson("tak");
    }
}
