package com.Tablica.ogloszenie;

public class OgloszenieDto {
    private long id;
    private String tytul;
    private String tekst;
    private String autor;
    private long ocena;
    private String data;
    private String kategoria;
    private boolean obserwuje;


//CONSTRUCTORS

    public OgloszenieDto() {
    }

    public OgloszenieDto(long id, String tytul, String tekst, String autor, String data, long ocena,  String kategoria, boolean obserwuje) {
        this.id = id;
        this.tytul = tytul;
        this.tekst = tekst;
        this.autor = autor;
        this.ocena = ocena;
        this.data = data;
        this.kategoria = kategoria;
        this.obserwuje = obserwuje;
    }
}
