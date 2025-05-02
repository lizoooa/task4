public class Main {
    public static void main(String[] args) {
        SklepKomputerowy sklep = new SklepKomputerowy();

        Produkt laptop = new Produkt();
        laptop.setId(1);
        laptop.setNazwa("Lenovo ThinkPad");
        laptop.setKategoria("Laptop");
        laptop.setCena(4500.0);
        laptop.setIloscWMagazynie(10);

        Produkt mysz = new Produkt();
        mysz.setId(2);
        mysz.setNazwa("Logitech M185");
        mysz.setKategoria("Mysz");
        mysz.setCena(70.0);
        mysz.setIloscWMagazynie(30);

        sklep.dodajProdukt(laptop);
        sklep.dodajProdukt(mysz);

        Klient klient = new Klient();
        klient.setId(1);
        klient.setImie("Anna");
        klient.setNazwisko("Kowalska");
        klient.setEmail("anna@example.com");
        klient.setCzyStaly(true);

        sklep.dodajKlienta(klient);

        Produkt[] produktyDoZamowienia = { laptop, mysz };
        int[] ilosci = { 1, 2 };

        sklep.utworzZamowienie(klient, produktyDoZamowienia, ilosci, "2025-05-02");

        sklep.zmienStatusZamowienia(1, "Zrealizowane");

        System.out.println("Produkty w kategorii Laptop:");
        sklep.wyswietlProduktyWKategorii("Laptop");

        System.out.println("Zamówienia klienta Anna Kowalska:");
        sklep.wyswietlZamowieniaKlienta(1);
    }
}
