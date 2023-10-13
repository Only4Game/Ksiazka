package pl.gornik.ksiazka;

public class Ksiazka {
    String tytul;

    String kategoria;

    int iloscStron;

    double cena;

    int iloscSztuk;

    public Ksiazka(String tytul, String kategoria, int iloscStron, double cena, int iloscSztuk) {
        this.tytul = tytul;
        this.kategoria = kategoria;
        this.iloscStron = iloscStron;
        this.cena = cena;
        this.iloscSztuk = iloscSztuk;
    }

    @Override
    public String toString() {
        return "Książka o tytule: " + tytul +
                ", znajduje się w kategorii: " + kategoria +
                ", ilość sztuk w sklepie stacjonarnym: " + iloscSztuk
                ;
    }

    public String obliczCene(){
        return "Książka o tytule: " + tytul +
                " kosztuje " + cena +
                " za sztukę, wartoś wszystkich książek w sklepie wyniesie: " + (cena*iloscSztuk);

    }
}
