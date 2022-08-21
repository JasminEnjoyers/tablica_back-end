package com.Tablica.kategoria;

import javax.persistence.*;

@Entity
@Table ( name = "kategorie" )
public class Kategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nazwa;


//CONSTRUCTORS

    public Kategoria() {
    }

    public Kategoria(String nazwa) {
        super();
        this.nazwa = nazwa;
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
}

