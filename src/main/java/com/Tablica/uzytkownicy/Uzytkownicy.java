@Entity
public class Uzytkownicy {
    @Id
    private long id;
    private String email;
    @ManyToOne
    @JoinColumn(name = "id")
    private long id_grupy;
    private String telefon;
    private long reputacja;
    private String nazwa;
    private String imie;
    private String nazwisko;
    private String haslo;


//CONSTRUCTORS

    public Uzytkownicy() {
    }

    public Uzytkownicy(long id, String email, long id_grupy, String telefon, long reputacja, String nazwa, String imie, String nazwisko, String haslo) {
        this.id = id;
        this.email = email;
        this.id_grupy = id_grupy;
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
        return id_grupy;
    }

    public void setId_grupy(long id_grupy) {
        this.id_grupy = id_grupy;
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
