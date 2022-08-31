package com.Tablica.uzytkownik;


public class UzytkownikDto {
    private long id;
    private String email;
    private long idGrupy;
    private String telefon;
    private long reputacja;
    private String nazwa;
    private String imie;
    private String nazwisko;


//CONSTRUCTORS

    public UzytkownikDto() {
    }

    public UzytkownikDto(String email, long idGrupy, String telefon, long reputacja, String nazwa, String imie, String nazwisko, long id) {
        super();
        this.email = email;
        this.idGrupy = idGrupy;
        this.telefon = telefon;
        this.reputacja = reputacja;
        this.nazwa = nazwa;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }
}
