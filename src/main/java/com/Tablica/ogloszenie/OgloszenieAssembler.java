package com.Tablica.ogloszenie;

import org.springframework.stereotype.Component;

@Component
public class OgloszenieAssembler {

    OgloszenieDto toOgloszenieDto(Ogloszenie post){
        OgloszenieDto dto = new OgloszenieDto(
                post.getId(),
                post.getTytul(),
                post.getTekst(),
                post.getAutor().getNazwa(),
                post.getData(),
                post.getOcena(),
                post.getKategoria().getNazwa()

        );
        return dto;
    }
}
