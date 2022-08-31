package com.Tablica.kategoria;

import com.Tablica.ogloszenie.Ogloszenie;

import javax.persistence.*;
import java.util.List;

@Entity
@Table ( name = "kategorie" )
public class Kategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nazwa;

    @OneToMany(mappedBy = "id")
    private List<Ogloszenie> ogloszenia;


//CONSTRUCTORS

    public Kategoria() {
    }

    public Kategoria(String nazwa, List<Ogloszenie> ogloszenia) {
        super();
        this.nazwa = nazwa;
        this.ogloszenia = ogloszenia;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Ogloszenie> getOgloszenia() {
        return ogloszenia;
    }

    public void setOgloszenia(List<Ogloszenie> ogloszenia) {
        this.ogloszenia = ogloszenia;
    }
}

