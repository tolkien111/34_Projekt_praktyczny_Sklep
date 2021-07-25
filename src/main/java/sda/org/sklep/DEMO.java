package sda.org.sklep;


public class DEMO {
    public static void main(String[] args) {

        Product apple = new Product("Jabłko", 1, KindOfAmount.KG, 1.2);
        Product pear = new Product("Maka", 2, KindOfAmount.KG,4);
        Product bier = new Product("Piwo", 3, KindOfAmount.PIECES, 5.89);
        Product cigaretes = new Product("Cigaretes", 4, KindOfAmount.PIECES, 20);
        Product cigaretes2 = new Product("Cigaretes", 4, KindOfAmount.PIECES, 20);
        Product cigaretes3 = new Product("Cigaretessss", 4, KindOfAmount.PIECES, 20);

        Storage storage = new Storage();

        storage.addProduct(apple);
        storage.addProduct(pear);
        storage.addProduct(bier);
        storage.addProduct(cigaretes);
        storage.addProduct(cigaretes2);

        storage.listOfProducts();

        Basket basket = new Basket(storage.products);

        basket.addProduct(cigaretes);
        basket.addProduct(cigaretes3);
        basket.listOfProducts();
        storage.listOfProducts();
    }
}
