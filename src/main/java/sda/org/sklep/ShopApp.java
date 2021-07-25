package sda.org.sklep;
/**
 Zakładamy projekt, dodajemy wsparcie marena, wystawiamy projekt na GitHub
 Na początek robimy bez bazy danych
 Robimy testy -JUnit4, JUnit5, AssertJ, Spock (jeśli ktoś zna), ale mają być
 Zakładamy osobne branch na zmiany i robimy Pull Requesty na GitHubie
 PullRequest powinien przejść przegląd kodu przed merge
 Projekt „Sklep”
 Na pewno ma mieć możliwość
 - Ewidencji towarów, w tym dodawania nowego, dodawania sztuk (kg, …) do istniejącego stanu
 - Ewidencji zakupów - czyli w ramach wejścia do sklepu ktoś robi swoje zakupy, ma się to odbić na ilości dostępnego towaru
 */




import java.util.Scanner;

import java.util.Scanner;

public class ShopApp {

    public static void main(String[] args) {

        Storage storage = new Storage();

        ShopAppDemo.menu();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {

            case 1:
                ShopAppDemo.list();
                storage.listOfProducts();
                break;
            case 2:
                ShopAppDemo.choice();
                storage.listOfProducts();
                // tutaj ładujemy liste produktow
                int add_productId = scanner.nextInt();

                // dodajemy produkt do koszyka
                break;
            case 3:
                ShopAppDemo.choice();
                // tutaj ładujemy liste produktów
                int remove_productId = scanner.nextInt();
                // usuwamy produkt z koszyka
                break;
            case 4:
                // idziemy do kasy
                break;
        }


    }
}
