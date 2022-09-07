package com.Tablica.zgloszenie;

import java.util.List;

public class ZgloszenieDto {
    private Long ogloszenieId;
    private String tytul;
    private String tekst;
    private String autor;
    private String data;
    private String kategoria;
    private List<String> osobyZglaszajace;

    public ZgloszenieDto(Long ogloszenieId,String tytul, String tekst, String autor, String data, String kategoria, List<String> osobyZglaszajace) {
        this.ogloszenieId = ogloszenieId;
        this.tytul = tytul;
        this.tekst = tekst;
        this.autor = autor;
        this.data = data;
        this.kategoria = kategoria;
        this.osobyZglaszajace = osobyZglaszajace;
    }

}
