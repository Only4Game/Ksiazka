package pl.gornik;

import pl.gornik.ksiazka.Ksiazka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Ksiazka> ksiazkaList = new ArrayList<>();

        Ksiazka ksiazka2 = new Ksiazka("Berserk", "Manga", 127, 139.99,35);
//        Ksiazka ksiazka3 = new Ksiazka("Harry Potter i więzień Leningradu", "Fantasy/Dramat",344, 49.59, 2);
//        Ksiazka ksiazka4 = new Ksiazka("Stuu - Jo ni chcioł", "Psychologia fikcyjna", 12,89.99, 20);

        //funkcja wyswietla " ... + nalezy do kategorii + ... + i ma + ... + tomów

//        System.out.println(ksiazka1);
//
//        System.out.println(ksiazka2);
//
//        System.out.println(ksiazka3);

        System.out.println(" ");

        //funkcja wyswietla " ksiazka o tytule + ... + cena za sztukę wynosi + ... + cena za wszystkie książki w sklepie wynosi + ...

//        System.out.println(ksiazka1.obliczCene());
//
//        System.out.println(ksiazka2.obliczCene());
//
//        System.out.println(ksiazka3.obliczCene());

        Ksiazka ksiazka;
        String tytul;
        String kategoria;
        int iloscStron;
        double cena;
        int iloscSztuk;


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Podaj tytuł twojej książki");
            String tytulKsiazki = scanner.nextLine();
            System.out.println("Podaj kategorię twojej książki");
            String kategoriaKsiazki = scanner.nextLine();
            System.out.println("Podaj liczbę stron twojej książki");
            int stronyKsiazki = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj cenę twojej książki");
            double cenaKsiazki = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj ile twoich książek chcesz zamówić do sklepu");
            int iloscKsiazek = scanner.nextInt();
            scanner.nextLine();
            ksiazka = new Ksiazka(tytulKsiazki, kategoriaKsiazki, stronyKsiazki, cenaKsiazki, iloscKsiazek);
            ksiazkaList.add(ksiazka);
        }
        for(Ksiazka ksiazka1: ksiazkaList){
            System.out.println(ksiazka1);


        }
    }
}