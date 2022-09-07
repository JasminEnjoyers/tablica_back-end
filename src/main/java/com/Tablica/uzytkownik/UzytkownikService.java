package com.Tablica.uzytkownik;

import com.Tablica.grupa.GrupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UzytkownikService {

    @Autowired
    UzytkownikRepository uzytkownikRepository;

    @Autowired
    GrupaRepository grupaRepository;

    public long getIdUzytkownikaByNazwa(String nazwa){
        return uzytkownikRepository.findFirstByNazwa(nazwa).getId();
    }

    public Uzytkownik finduser(String login, String password){
        Uzytkownik user = uzytkownikRepository.findFirstByNazwa(login);

        if(user != null) try {
            if (user.getHaslo().equals(password)) {
                return user;
            }
        }catch (Exception e){}

        return null;
    }

    public Uzytkownik createUser(String login, String password, String email, String phone, String firstName, String lastName){
        Uzytkownik user = new Uzytkownik(email, (grupaRepository.findFirstByNazwa("user")),phone,login,firstName,lastName,password);

        try{
            uzytkownikRepository.save(user);
            return user;
        }catch (Exception e){}

        return null;
    }
}
