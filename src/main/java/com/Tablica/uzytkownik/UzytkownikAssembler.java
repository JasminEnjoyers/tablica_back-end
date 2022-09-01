package com.Tablica.uzytkownik;

import org.springframework.stereotype.Component;

@Component
public class UzytkownikAssembler {

    UzytkownikDto toUzytkownikDto(Uzytkownik user){
        UzytkownikDto dto = new UzytkownikDto(
                user.getEmail(),
                user.getGrupa().getId(),
                user.getTelefon(),
                user.getReputacja(),
                user.getNazwa(),
                user.getImie(),
                user.getNazwisko(),
                user.getId()
        );
        return dto;
    }
}
