package com.Tablica.ogloszenie;

import org.springframework.stereotype.Component;

@Component
public class OgloszenieAssembler {

    OgloszenieDto toUzytkownikDto(Ogloszenie post){
        OgloszenieDto dto = new OgloszenieDto(
                post.getTytul(),
                post.getTekst(),
                post.getAutor(),
                post.getData(),
                post.getKategoria(),
                post.getOcena(),
                post.getId()
        );
        return dto;
    }
}
