package com.Tablica.ogloszenie;

import org.springframework.stereotype.Component;

@Component
public class OgloszenieAssembler {

    public OgloszenieDto toOgloszenieDto(Ogloszenie post){
        OgloszenieDto dto = new OgloszenieDto(
                post.getId(),
                post.getTytul(),
                post.getTekst(),
                post.getAutor().getNazwa(),
                post.getData().toString(),
                post.getOcena(),
                post.getKategoria().getNazwa()
        );
        return dto;
    }
}
