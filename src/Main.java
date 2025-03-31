public class Main {
    public static void main(String[] args) {
        SklepKomputerowy sklep = new SklepKomputerowy();

        Produkt laptop = new Produkt(1, "Laptop HP", "Laptop", 2500, 10);
        Produkt mysz = new Produkt(2, "Mysz Logitech", "Mysz", 150, 50);
        sklep.dodajProdukt(laptop);
        sklep.dodajProdukt(mysz);

        Klient klient1 = new Klient(1, "Jan", "Kowalski", "jan@email.com", true);
        sklep.dodajKlienta(klient1);

        Produkt[] produktyZamowienia = {laptop, mysz};
        int[] ilosci = {1, 2};

        sklep.utworzZamowienie(klient1, produktyZamowienia, ilosci);
        sklep.aktualizujStanMagazynowy(sklep.zamowienia[0]);

        sklep.wyswietlZamowieniaKlienta(1);
        sklep.wyswietlProduktyWKategorii("Mysz");
    }
}
