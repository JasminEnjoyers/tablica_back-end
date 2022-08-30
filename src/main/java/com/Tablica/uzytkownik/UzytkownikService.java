package com.Tablica.uzytkownik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UzytkownikService {

    @Autowired
    UzytkownikRepository uzytkownikRepository;

    public long getIdUzytkownikaByNazwa(String nazwa){
        return uzytkownikRepository.findFirstByNazwa(nazwa).getId();
    }

    public Uzytkownik finduser(String login, String password){
        Uzytkownik user = uzytkownikRepository.findFirstByNazwa(login);

        try {
            if (user.getHaslo().equals(password)) {
                return user;
            }
        }catch (Exception e){}

        return null;
    }

    public Uzytkownik createUser(String login, String password, String email, String phone, String firstName, String lastName){
        Uzytkownik user = new Uzytkownik(email,2,phone,0,login,firstName,lastName,password);

        try{
            uzytkownikRepository.save(user);
            return user;
        }catch (Exception e){}

        return null;
    }
}
