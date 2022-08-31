package com.Tablica.grupa;

import com.Tablica.uzytkownik.Uzytkownik;

import javax.persistence.*;
import java.util.List;

@Entity
@Table ( name = "grupy" )
public class Grupa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nazwa;

    @OneToMany(mappedBy = "id" )
    private List<Uzytkownik> uzytkownicy;

//CONSTRUCTORS

    public Grupa() {
    }

    public Grupa(String nazwa, List<Uzytkownik> uzytkownicy) {
        super();
        this.nazwa = nazwa;
        this.uzytkownicy = uzytkownicy;
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

    public List<Uzytkownik> getUzytkownicy() {
        return uzytkownicy;
    }

    public void setUzytkownicy(List<Uzytkownik> uzytkownicy) {
        this.uzytkownicy = uzytkownicy;
    }
}
