public class SklepKomputerowy {
    Produkt[] produkty = new Produkt[100];
    Klient[] klienci = new Klient[100];
    Zamowienie[] zamowienia = new Zamowienie[100];
    int liczbaProduktow = 0;
    int liczbaKlientow = 0;
    int liczbaZamowien = 0;

    public void dodajProdukt(Produkt produkt) {
        produkty[liczbaProduktow] = produkt;
        liczbaProduktow++;
    }

    public void dodajKlienta(Klient klient) {
        klienci[liczbaKlientow] = klient;
        liczbaKlientow++;
    }

    public void utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie zamowienie = new Zamowienie(liczbaZamowien + 1, klient, produkty, ilosci);
        zamowienia[liczbaZamowien] = zamowienie;
        liczbaZamowien++;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.produkty.length; i++) {
            for (int j = 0; j < liczbaProduktow; j++) {
                if (produkty[j].id == zamowienie.produkty[i].id) {
                    produkty[j].iloscWMagazynie -= zamowienie.ilosci[i];
                }
            }
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].id == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
                break;
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        System.out.println("Produkty w kategorii: " + kategoria);
        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].kategoria.equals(kategoria)) {
                produkty[i].wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("Zamówienia dla klienta ID: " + idKlienta);
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].klient.id == idKlienta) {
                zamowienia[i].wyswietlSzczegoly();
            }
        }
    }
}
