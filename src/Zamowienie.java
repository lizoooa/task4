import java.util.Date;

public class Zamowienie {
    int id;
    Klient klient;
    Produkt[] produkty;
    int[] ilosci;
    String dataZamowienia;
    String status;

    public Zamowienie(int id, Klient klient, Produkt[] produkty, int[] ilosci) {
        this.id = id;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosci = ilosci;
        this.dataZamowienia = new Date().toString();  // Для простоты используем текущую дату
        this.status = "Nowe";
    }

    public double obliczWartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].cena * ilosci[i];
        }
        return suma;
    }

    public void wyswietlSzczegoly() {
        System.out.println("Zamówienie ID: " + id + " | Data: " + dataZamowienia + " | Status: " + status);
        klient.wyswietlInformacje();
        System.out.println("Produkty:");
        for (int i = 0; i < produkty.length; i++) {
            System.out.println(produkty[i].nazwa + " x" + ilosci[i]);
        }
        System.out.println("Łączna wartość: " + obliczWartoscZamowienia() + " PLN");
    }

    public void setStatus(String nowyStatus) {
        this.status = nowyStatus;
    }
}
