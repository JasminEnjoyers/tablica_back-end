package com.Tablica.uzytkownik;

import com.Tablica.grupa.Grupa;
import com.Tablica.obserwowanyPost.ObserwowanyPost;
import com.Tablica.ogloszenie.Ogloszenie;
import com.Tablica.zgloszenie.Zgloszenie;

import javax.persistence.*;
import java.util.List;

@Entity
@Table ( name = "uzytkownicy" )
public class Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn (name = "id_grupy")
    private Grupa Grupa;

    @Column
    private String telefon;

    @Column
    private long reputacja;

    @Column
    private String nazwa;

    @Column
    private String imie;

    @Column
    private String nazwisko;

    @Column
    private String haslo;

    @OneToMany(mappedBy = "autor")
    List<Ogloszenie> ogloszenia;

    @OneToMany(mappedBy = "uzytkownik")
    List<Zgloszenie> zgloszenia;

    @OneToMany(mappedBy = "uzytkownik")
    List<ObserwowanyPost> obserwowane;

//CONSTRUCTORS

    public Uzytkownik() {
    }

    public Uzytkownik(String email, com.Tablica.grupa.Grupa grupa, String telefon, long reputacja, String nazwa, String imie, String nazwisko, String haslo) {
        super();
        this.email = email;
        this.Grupa = grupa;
        this.telefon = telefon;
        this.reputacja = reputacja;
        this.nazwa = nazwa;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.haslo = haslo;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public com.Tablica.grupa.Grupa getGrupa() {
        return Grupa;
    }

    public void setGrupa(com.Tablica.grupa.Grupa grupa) {
        Grupa = grupa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public long getReputacja() {
        return reputacja;
    }

    public void setReputacja(long reputacja) {
        this.reputacja = reputacja;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}
