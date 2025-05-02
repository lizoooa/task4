public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
    public Klient getKlient() {
        return klient;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }
    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }
    public int[] getIlosci() {
        return ilosci;
    }

    public void setDataZamowienia(String data) {
        this.dataZamowienia = data;
    }
    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public double obliczWartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosci[i];
        }
        return suma;
    }

    public double zastosujZnizke() {
        double wartosc = obliczWartoscZamowienia();
        if (klient.getCzyStaly()) {
            wartosc *= 0.9;
        }
        return wartosc;
    }

    public void wyswietlSzczegoly() {
        System.out.println("Zamówienie nr " + id + ", Data: " + dataZamowienia + ", Status: " + status);
        klient.wyswietlInformacje();
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("- " + produkty[i].getNazwa() + ", Ilość: " + ilosci[i]);
        }
        System.out.println("Wartość zamówienia (po zniżce): " + zastosujZnizke());
    }
}
