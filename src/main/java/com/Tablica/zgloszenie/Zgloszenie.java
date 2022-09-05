package com.Tablica.zgloszenie;

import com.Tablica.ogloszenie.Ogloszenie;
import com.Tablica.uzytkownik.Uzytkownik;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table ( name = "zgloszenia" )
public class Zgloszenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_uzytkownika")
    private Uzytkownik uzytkownik;

    @ManyToOne
    @JoinColumn(name = "id_ogloszenia")
    private Ogloszenie ogloszenie;

    @Column
    private String tekst;


//CONSTRUCTORS

    public Zgloszenie() {
    }

    public Zgloszenie(Uzytkownik uzytkownik, Ogloszenie ogloszenie, String tekst) {
        super();
        this.uzytkownik = uzytkownik;
        this.ogloszenie = ogloszenie;
        this.tekst = tekst;
    }

    //GETTERS AND SETTERS

    public long getIdZgloszenia() {
        return id;
    }

    public void setIdZgloszenia(long idZgloszenia) {
        this.id = idZgloszenia;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public Ogloszenie getOgloszenie() {
        return ogloszenie;
    }

    public void setOgloszenie(Ogloszenie ogloszenie) {
        this.ogloszenie = ogloszenie;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
