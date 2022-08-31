package com.Tablica.obserwowanyPost;

import com.Tablica.ogloszenie.Ogloszenie;
import com.Tablica.uzytkownik.Uzytkownik;

import javax.persistence.*;

@Entity
@Table ( name = "obserwowane_posty" )
public class ObserwowanyPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_uzytkownika")
    private Uzytkownik uzytkownik;

    @ManyToOne
    @JoinColumn(name = "id_ogloszenia")
    private Ogloszenie ogloszenie;


//CONSTRUCTORS

    public ObserwowanyPost() {
    }

    public ObserwowanyPost(long id, com.Tablica.uzytkownik.Uzytkownik uzytkownik, com.Tablica.ogloszenie.Ogloszenie ogloszenie) {
        super();
        this.uzytkownik = uzytkownik;
        this.ogloszenie = ogloszenie;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public com.Tablica.uzytkownik.Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(com.Tablica.uzytkownik.Uzytkownik uzytkownik) {
        uzytkownik = uzytkownik;
    }

    public com.Tablica.ogloszenie.Ogloszenie getOgloszenie() {
        return ogloszenie;
    }

    public void setOgloszenie(com.Tablica.ogloszenie.Ogloszenie ogloszenie) {
        ogloszenie = ogloszenie;
    }
}