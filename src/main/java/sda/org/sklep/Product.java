package sda.org.sklep;

import lombok.Getter;


import java.util.Objects;

@Getter

public class Product {

    private String productName;
    private int productId;
    private KindOfAmount kindOfAmount;
    private int amountInPieces;
    private double amountInKilograms;
    private double price;

    public Product(String productName, int productId,KindOfAmount kindOfAmount, String amount, double price) {
        //na podstawie stringa parsujemy do liczby która nas interesuje (double albo int)
        if (kindOfAmount == KindOfAmount.KG){
           amountInKilograms = Double.parseDouble(amount);
        } else if (kindOfAmount == KindOfAmount.PIECES){
            amountInPieces = Integer.parseInt(amount);
        } else {
            System.out.println("Put correct kind of amout");
        }
        this.productName = productName;
        this.productId = productId;
        this.kindOfAmount = kindOfAmount;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Objects.equals(productName, product.productName) && Objects.equals(kindOfAmount, product.kindOfAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productId, kindOfAmount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", kindOfAmount=" + kindOfAmount +
                ", amountInPieces=" + amountInPieces +
                ", amountInKilograms=" + amountInKilograms +
                ", price=" + price +
                '}';
    }
}
