package com.Tablica.uzytkownik;


import com.Tablica.grupa.Grupa;

public class UzytkownikDto {
    private long id;
    private String email;
    private long grupa;
    private String telefon;
    private String nazwa;
    private String imie;
    private String nazwisko;


//CONSTRUCTORS

    public UzytkownikDto() {
    }

    public UzytkownikDto(String email, long grupa, String telefon, String nazwa, String imie, String nazwisko, long id) {
        super();
        this.email = email;
        this.grupa = grupa;
        this.telefon = telefon;
        this.nazwa = nazwa;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }
}
