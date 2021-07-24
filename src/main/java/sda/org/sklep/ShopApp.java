package sda.org.sklep;

import java.util.Scanner;

public class ShopApp {

    public static void main(String[] args) {

        ShopAppDemo.menu();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {

            case 1:
                ShopAppDemo.list();
                break;
            case 2:
                ShopAppDemo.choice();
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
