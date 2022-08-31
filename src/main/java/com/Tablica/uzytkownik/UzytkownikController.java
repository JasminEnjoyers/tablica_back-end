package com.Tablica.uzytkownik;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import static java.lang.Long.parseLong;


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

    @PutMapping("/user/email")
    @ResponseStatus(HttpStatus.OK)
    public boolean emailUpdate(
            @RequestParam Long userId,
            @RequestParam String newEmail
    ){
        Uzytkownik user = uzytkownikRepository.findById(userId).orElse(null);
        user.setEmail(newEmail);
        try {
            uzytkownikRepository.save(user);
            return false;
        }catch (Exception e){
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/user/phone")
    @ResponseStatus(HttpStatus.OK)
    public boolean phoneUpdate(
            @RequestParam Long userId,
            @RequestParam String newPhone
    ){
        Uzytkownik user = uzytkownikRepository.findById(userId).orElse(null);
        user.setTelefon(newPhone);
        try {
            uzytkownikRepository.save(user);
            return false;
        }catch (Exception e){
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/user/firstName")
    @ResponseStatus(HttpStatus.OK)
    public boolean firstNameUpdate(
            @RequestParam Long userId,
            @RequestParam String newFirstName
    ){
        Uzytkownik user = uzytkownikRepository.findById(userId).orElse(null);
        user.setImie(newFirstName);
        try {
            uzytkownikRepository.save(user);
            return false;
        }catch (Exception e){
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/user/lastName")
    @ResponseStatus(HttpStatus.OK)
    public boolean lastNameUpdate(
            @RequestParam Long userId,
            @RequestParam String newLastName
    ){
        Uzytkownik user = uzytkownikRepository.findById(userId).orElse(null);
        user.setNazwisko(newLastName);
        try {
            uzytkownikRepository.save(user);
            return false;
        }catch (Exception e){
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/user/login")
    @ResponseStatus(HttpStatus.OK)
    public boolean LoginUpdate(
            @RequestParam Long userId,
            @RequestParam String newLogin
    ){
        Uzytkownik user = uzytkownikRepository.findById(userId).orElse(null);
        user.setNazwa(newLogin);
        try {
            uzytkownikRepository.save(user);
            return false;
        }catch (Exception e){
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("api/uzytkownicy/uzytkownik")
    @ResponseStatus(HttpStatus.OK)
    public Uzytkownik findFirstById(
            @RequestParam String id
    ){
        Uzytkownik user = uzytkownikRepository.findFirstById(parseLong(id));
        if(user != null) {
            return user;
        }
        else return new Uzytkownik();
    }
}
