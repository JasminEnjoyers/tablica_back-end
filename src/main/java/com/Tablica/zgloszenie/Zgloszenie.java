package com.Tablica.zgloszenie;

import javax.persistence.*;

@Entity
@Table ( name = "zgloszenia" )
public class Zgloszenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idZgloszenia;
    @Column
    private long idUzytkownika;
    @Column
    private long idOgloszenia;
    @Column
    private String tekst;


//CONSTRUCTORS

    public Zgloszenie() {
    }

    public Zgloszenie(long idUzytkownika, long idOgloszenia, String tekst) {
        super();
        this.idUzytkownika = idUzytkownika;
        this.idOgloszenia = idOgloszenia;
        this.tekst = tekst;
    }


//GETTERS AND SETTERS

    public long getId_zgloszenia() {
        return idZgloszenia;
    }

    public void setId_zgloszenia(long idZgloszenia) {
        this.idZgloszenia = idZgloszenia;
    }
    public long getId_uzytkownika() {
        return idUzytkownika;
    }

    public void setId_uzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    public long getId_ogloszenia() {
        return idOgloszenia;
    }

    public void setId_ogloszenia(long idOgloszenia) {
        this.idOgloszenia = idOgloszenia;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
