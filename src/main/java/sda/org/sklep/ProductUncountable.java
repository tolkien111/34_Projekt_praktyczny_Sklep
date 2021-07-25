package sda.org.sklep;

public class ProductUncountable extends Product{

    private double amount;


    public ProductUncountable(String productName, int productId, Enum<KindOfAmount> kindOfAmount,double amount, double price) {
        super(productName, productId, kindOfAmount, price);
        this.amount = amount;
    }
}
