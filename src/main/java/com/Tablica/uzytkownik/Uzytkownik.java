package com.Tablica.uzytkownik;

import javax.persistence.*;

@Entity
@Table ( name = "uzytkownicy" )
public class Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String email;
    @Column (name = "id_grupy")
    private long idGrupy;
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


//CONSTRUCTORS

    public Uzytkownik() {
    }

    public Uzytkownik(String email, long idGrupy, String telefon, long reputacja, String nazwa, String imie, String nazwisko, String haslo) {
        super();
        this.email = email;
        this.idGrupy = idGrupy;
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

    public long getId_grupy() {
        return idGrupy;
    }

    public void setId_grupy(long id_grupy) {
        this.idGrupy = idGrupy;
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
