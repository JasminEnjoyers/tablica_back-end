package com.Tablica.obserwowanyPost;

import com.Tablica.ogloszenie.Ogloszenie;
import com.Tablica.uzytkownik.Uzytkownik;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    public ObserwowanyPost(Uzytkownik uzytkownik, com.Tablica.ogloszenie.Ogloszenie ogloszenie) {
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
}