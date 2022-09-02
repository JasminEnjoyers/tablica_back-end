package com.Tablica.zgloszenie;

import java.util.List;

public class ZgloszenieDto {
    private Long ogloszenieId;
    private String tytul;
    private String tekst;
    private String autor;
    private long ocena;
    private String data;
    private String kategoria;
    private List<String> osobyZglaszajace;

    public ZgloszenieDto(Long ogloszenieId,String tytul, String tekst, String autor, long ocena, String data, String kategoria, List<String> osobyZglaszajace) {
        this.ogloszenieId = ogloszenieId;
        this.tytul = tytul;
        this.tekst = tekst;
        this.autor = autor;
        this.ocena = ocena;
        this.data = data;
        this.kategoria = kategoria;
        this.osobyZglaszajace = osobyZglaszajace;
    }

}
