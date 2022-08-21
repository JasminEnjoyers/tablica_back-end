package com.Tablica.uzytkownik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UzytkownikService {

    @Autowired
    UzytkownikRepository uzytkownikRepository;

    public Uzytkownik finduser(String login, String password){
        Uzytkownik user = uzytkownikRepository.findFirstByNazwa(login);

        try {
            if (user.getHaslo().equals(password)) {
                return user;
            }
        }catch (Exception e){}

        return null;
    }
}
