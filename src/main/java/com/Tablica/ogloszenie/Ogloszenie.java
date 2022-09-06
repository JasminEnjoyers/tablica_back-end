package com.Tablica.ogloszenie;

import com.Tablica.kategoria.Kategoria;
import com.Tablica.obserwowanyPost.ObserwowanyPost;
import com.Tablica.uzytkownik.Uzytkownik;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Table ( name = "ogloszenia" )
public class Ogloszenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "id_autora")
    private Uzytkownik autor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "id_kategorii")
    private Kategoria kategoria;

    @Column
    private long ocena;

    @Column
    private String tytul;

    @Column
    private String tekst;

    @Column (name = "data_dodania")
    private Date data;

    @OneToMany (mappedBy = "id")
    private List<ObserwowanyPost> obserwowania;


//CONSTRUCTORS

    public Ogloszenie() {
    }

    public Ogloszenie(Uzytkownik autor, Kategoria kategoria, long ocena, String tytul, String tekst, Date data, List<ObserwowanyPost> obserwujacy) {
        super();
        this.autor = autor;
        this.kategoria = kategoria;
        this.ocena = ocena;
        this.tytul = tytul;
        this.tekst = tekst;
        this.data = data;
        this.obserwowania = obserwujacy;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Uzytkownik getAutor() {
        return autor;
    }

    public void setAutor(Uzytkownik autor) {
        this.autor = autor;
    }


    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
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

    public List<ObserwowanyPost> getObserwowania() {
        return obserwowania;
    }

    public void setObserwowania(List<ObserwowanyPost> obserwujacy) {
        this.obserwowania = obserwujacy;
    }
}
