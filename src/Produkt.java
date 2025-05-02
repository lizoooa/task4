public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getNazwa() {
        return nazwa;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public String getKategoria() {
        return kategoria;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public double getCena() {
        return cena;
    }

    public void setIloscWMagazynie(int ilosc) {
        this.iloscWMagazynie = ilosc;
    }
    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Produkt: " + nazwa + ", Kategoria: " + kategoria + ", Cena: " + cena + ", Ilość: " + iloscWMagazynie);
    }
}
