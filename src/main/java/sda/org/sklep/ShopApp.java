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

public class ShopApp {

    public static void main(String[] args) {


        System.out.println("Shop menu, choose what do you want to do: ");

        System.out.println("Chose 1 to view products");
        System.out.println("Chose 2 to add products");
        System.out.println("Chose 3 to remove products");
        System.out.println("Chose 1 to ");
        System.out.println("Chose 1 to view products");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:

        }
    }
}
