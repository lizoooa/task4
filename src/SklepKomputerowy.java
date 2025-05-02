public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[100];
    private Klient[] klienci = new Klient[100];
    private Zamowienie[] zamowienia = new Zamowienie[100];

    private int liczbaProduktow = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;

    public void dodajProdukt(Produkt p) {
        produkty[liczbaProduktow] = p;
        liczbaProduktow++;
    }

    public void dodajKlienta(Klient k) {
        klienci[liczbaKlientow] = k;
        liczbaKlientow++;
    }

    public void utworzZamowienie(Klient klient, Produkt[] zamProdukty, int[] ilosci, String data) {
        Zamowienie z = new Zamowienie();
        z.setId(liczbaZamowien + 1);
        z.setKlient(klient);
        z.setProdukty(zamProdukty);
        z.setIlosci(ilosci);
        z.setDataZamowienia(data);
        z.setStatus("Nowe");

        zamowienia[liczbaZamowien] = z;
        liczbaZamowien++;

        aktualizujStanMagazynowy(z);
    }

    public void aktualizujStanMagazynowy(Zamowienie z) {
        Produkt[] prod = z.getProdukty();
        int[] ilosci = z.getIlosci();

        for (int i = 0; i < prod.length; i++) {
            int nowaIlosc = prod[i].getIloscWMagazynie() - ilosci[i];
            prod[i].setIloscWMagazynie(nowaIlosc);
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].getKategoria().equalsIgnoreCase(kategoria)) {
                produkty[i].wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getKlient().getId() == idKlienta) {
                zamowienia[i].wyswietlSzczegoly();
            }
        }
    }
}
