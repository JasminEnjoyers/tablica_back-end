package com.Tablica.ogloszenia;

import javax.persistence.*;
import java.sql.Date;


@Entity
public class Ogloszenia {
    @Id
    private long id;
    @Column
    private long id_autora;
    @Column
    private long id_kategorii;
    @Column
    private long ocena;
    @Column
    private String tytul;
    @Column
    private Date data;


//CONSTRUCTORS

    public Ogloszenia() {
    }

    public Ogloszenia(long id, long id_autora, long id_kategorii, long ocena, String tytul, Date data) {
        this.id = id;
        this.id_autora = id_autora;
        this.id_kategorii = id_kategorii;
        this.ocena = ocena;
        this.tytul = tytul;
        this.data = data;
    }


//GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_autora() {
        return id_autora;
    }

    public void setId_autora(long id_autora) {
        this.id_autora = id_autora;
    }

    public long getId_kategorii() {
        return id_kategorii;
    }

    public void setId_kategorii(long id_kategorii) {
        this.id_kategorii = id_kategorii;
    }

    public long getOcena() {
        return ocena;
    }

    public void setOcena(long ocena) {
        this.ocena = ocena;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
