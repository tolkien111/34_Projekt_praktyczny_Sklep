package sda.org.sklep;


public class DEMO {
    public static void main(String[] args) {

        Product apple = new Product("Jabłko", 1, Amount.KG, 1.2);
        Product pear = new Product("Maka", 2, Amount.KG,4);
        Product bier = new Product("Piwo", 3, Amount.PIECES, 5.89);
        Product cigaretes = new Product("Cigaretes", 4, Amount.PIECES, 20);
        Product cigaretes2 = new Product("Cigaretes", 4, Amount.PIECES, 20);

        Storage storage = new Storage();

        storage.addProduct(apple);
        storage.addProduct(pear);
        storage.addProduct(bier);
        storage.addProduct(cigaretes);
        storage.addProduct(cigaretes2);

        storage.listOfProducts();

        Basket basket = new Basket(storage.products);

        basket.addProduct(cigaretes);
        basket.addProduct(cigaretes2);
        basket.listOfProducts();
    }
}
