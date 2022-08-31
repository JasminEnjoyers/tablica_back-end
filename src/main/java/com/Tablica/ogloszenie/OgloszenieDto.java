package com.Tablica.ogloszenie;


import com.Tablica.kategoria.Kategoria;
import com.Tablica.uzytkownik.Uzytkownik;

import java.sql.Date;

public class OgloszenieDto {
    private long id;
    private String tytul;
    private String tekst;
    private String autor;
    private long ocena;
    private Date data;
    private String kategoria;


//CONSTRUCTORS

    public OgloszenieDto(String tytul, String tekst, Uzytkownik autor, Date data, Kategoria kategoria, long ocena, long id) {
    }

    public OgloszenieDto(long id, String tytul, String tekst, String autor, long ocena, Date data, String kategoria) {
        super();
        this.tytul = tytul;
        this.tekst = tekst;
        this.autor = autor;
        this.ocena = ocena;
        this.data = data;
        this.kategoria = kategoria;
    }
}
