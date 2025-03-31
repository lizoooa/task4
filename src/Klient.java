public class Klient {
    int id;
    String imie;
    String nazwisko;
    String email;
    boolean czyStaly;

    public Klient(int id, String imie, String nazwisko, String email, boolean czyStaly) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.czyStaly = czyStaly;
    }

    public void wyswietlInformacje() {
        System.out.println("Klient: " + imie + " " + nazwisko + " | Email: " + email + " | Stały klient: " + (czyStaly ? "Tak" : "Nie"));
    }
}
