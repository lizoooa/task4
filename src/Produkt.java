public class Produkt {
    int id;
    String nazwa;
    String kategoria;
    double cena;
    int iloscWMagazynie;

    public Produkt(int id, String nazwa, String kategoria, double cena, int iloscWMagazynie) {
        this.id = id;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Produkt: " + nazwa + " | Kategoria: " + kategoria + " | Cena: " + cena + " | Ilość: " + iloscWMagazynie);
    }
}
