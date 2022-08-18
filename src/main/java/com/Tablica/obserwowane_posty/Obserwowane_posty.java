@Entity
public class Obserwowane_posty {
    private long id_uzytkownika;
    private long id_ogloszenia;


//CONSTRUCTORS

    public Obserwowane_posty() {
    }

    public Obserwowane_posty(long id_uzytkownika, long id_ogloszenia) {
        this.id_uzytkownika = id_uzytkownika;
        this.id_ogloszenia = id_ogloszenia;
    }


//GETTERS AND SETTERS

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
