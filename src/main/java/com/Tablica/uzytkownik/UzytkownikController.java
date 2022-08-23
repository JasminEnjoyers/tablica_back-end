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

    @Autowired
    UzytkownikRepository uzytkownikRepository;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String checkUserDetails(
            @RequestParam String login,
            @RequestParam String password
    ){
        Uzytkownik user = uzytkownikService.finduser(login,password);

        return gson.toJson(user);
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public String registerUser(
            @RequestParam String login,
            @RequestParam String password,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String firstName,
            @RequestParam String lastName
    ){
        Uzytkownik user = uzytkownikService.createUser(login,password,email,phone,firstName,lastName);

        return gson.toJson(user);
    }

    @GetMapping("/user/login/{login}")
    @ResponseStatus(HttpStatus.OK)
    public boolean checkUserDetails(
            @PathVariable String login
    ){
        Uzytkownik user = uzytkownikRepository.findFirstByNazwa(login);
        if(user != null){
            return true;
        }
        return false;
    }

    @GetMapping("/user/email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public boolean checkEmailDetails(
            @PathVariable String email
    ){
        Uzytkownik user = uzytkownikRepository.findFirstByEmail(email);
        if(user != null){
            return true;
        }
        return false;
    }

    @GetMapping("/user/phone/{phone}")
    @ResponseStatus(HttpStatus.OK)
    public boolean checkPhoneDetails(
            @PathVariable String phone
    ){
        Uzytkownik user = uzytkownikRepository.findFirstByTelefon(phone);
        if(user != null){
            return true;
        }
        return false;
    }
}
