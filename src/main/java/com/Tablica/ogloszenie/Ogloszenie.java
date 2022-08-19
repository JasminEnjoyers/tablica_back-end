package com.Tablica.ogloszenie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class Ogloszenie {
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
    private String tekst;
    @Column (name = "data_dodania")
    private Date data;


//CONSTRUCTORS

    public Ogloszenie() {
    }

    public Ogloszenie(long id, long id_autora, long id_kategorii, long ocena, String tytul, String tekst, Date data) {
        this.id = id;
        this.id_autora = id_autora;
        this.id_kategorii = id_kategorii;
        this.ocena = ocena;
        this.tytul = tytul;
        this.tekst = tekst;
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

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
