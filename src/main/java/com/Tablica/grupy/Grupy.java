package com.Tablica.grupy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grupy {
    @Id
    private long id;
    @Column
    private String nazwa;


//CONSTRUCTORS

    public Grupy() {
    }

    public Grupy(long id, String nazwa) {
        this.id = id;
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
