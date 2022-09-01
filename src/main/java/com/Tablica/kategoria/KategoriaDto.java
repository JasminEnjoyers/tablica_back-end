package com.Tablica.kategoria;

public class KategoriaDto {
    private long id;
    private String nazwa;


    //CONSTRUCTORS

    public KategoriaDto() {
    }

    public KategoriaDto(long id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }
}
