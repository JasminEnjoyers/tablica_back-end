package com.Tablica.obserwowanyPost;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "obserwowany_post")
public class ObserwowanyPost {
    @Id
    private long id;
    @Column
    private long id_uzytkownika;
    @Column
    private long id_ogloszenia;


//CONSTRUCTORS

    public ObserwowanyPost() {
    }

    public ObserwowanyPost(long id, long id_uzytkownika, long id_ogloszenia) {
        this.id = id;
        this.id_uzytkownika = id_uzytkownika;
        this.id_ogloszenia = id_ogloszenia;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_uzytkownika() {
        return id_uzytkownika;
    }

    public void setId_uzytkownika(long id_uzytkownika) {
        this.id_uzytkownika = id_uzytkownika;
    }

    public long getId_ogloszenia() {
        return id_ogloszenia;
    }

    public void setId_ogloszenia(long id_ogloszenia) {
        this.id_ogloszenia = id_ogloszenia;
    }
}
