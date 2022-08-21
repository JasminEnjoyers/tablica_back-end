package com.Tablica.grupa;

import javax.persistence.*;

@Entity
@Table ( name = "grupy" )
public class Grupa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nazwa;


//CONSTRUCTORS

    public Grupa() {
    }

    public Grupa(String nazwa) {
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
