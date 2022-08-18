import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Zgloszenia {
    @Column
    private long id_uzytkownika;
    @Column
    private long id_ogloszenia;
    @Column
    private String tekst;


//CONSTRUCTORS

    public Zgloszenia() {
    }

    public Zgloszenia(long id_uzytkownika, long id_ogloszenia, String tekst) {
        this.id_uzytkownika = id_uzytkownika;
        this.id_ogloszenia = id_ogloszenia;
        this.tekst = tekst;
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

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
