package com.Tablica.obserwowanyPost;

import javax.persistence.*;

@Entity
@Table ( name = "obserwowane_posty" )
public class ObserwowanyPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "id_uzytkownika")
    private long idUzytkownika;
    @Column (name = "id_ogloszenia")
    private long idOgloszenia;


//CONSTRUCTORS

    public ObserwowanyPost() {
    }

    public ObserwowanyPost(long idUzytkownika, long idOgloszenia) {
        super();
        this.idUzytkownika = idUzytkownika;
        this.idOgloszenia = idOgloszenia;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_uzytkownika() {
        return idUzytkownika;
    }

    public void setId_uzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    public long getId_ogloszenia() {return idOgloszenia;}

    public void setId_ogloszenia(long idOgloszenia) {
        this.idOgloszenia = idOgloszenia;
    }
}
