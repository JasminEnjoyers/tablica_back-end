package com.Tablica.kategoria;

import org.springframework.stereotype.Component;

@Component
public class KategoriaAssembler {
    public KategoriaDto toKategoriaDto(Kategoria kategoria){
        KategoriaDto dto= new KategoriaDto(
                kategoria.getId(),
                kategoria.getNazwa()
        );
        return dto;
    }
}
