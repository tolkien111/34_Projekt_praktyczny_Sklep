package sda.org.sklep;

public class ShopAppDemo {

    public static void menu() {
        System.out.println("Shop menu: chose what do you want to do.");
        System.out.println("Chose 1 to view products");
        System.out.println("Chose 2 to add product to your basket ");
        System.out.println("Chose 3 to remove product from your basket ");
        System.out.println("Chose 4 and go to checkout");
    }

    public static void list() {
        System.out.println("Lista produktów");
    }

    public static void choice() {
        System.out.println("Select product ID: ");
    }
}
