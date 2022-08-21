package com.Tablica.uzytkownik;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
public class UzytkownikController {

    private Gson gson = new GsonBuilder().create();

    @Autowired
    UzytkownikService uzytkownikService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String checkUserDetails(
            @RequestParam String login,
            @RequestParam String password
    ){
        Uzytkownik user = uzytkownikService.finduser(login,password);

        return gson.toJson(user);
    }
}
