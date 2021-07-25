package sda.org.sklep;

public class ProductCountable extends Product{

    private int amount;


    public ProductCountable(String productName, int productId, Enum<KindOfAmount> kindOfAmount, int amount, double price) {
        super(productName, productId, kindOfAmount, price);
        this.amount=amount;
    }
}
