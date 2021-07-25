package sda.org.sklep;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter

public class Product {

    private String productName;
    private int productId;
    private Enum <Amount> amount;
    private double price;

    public Product(String productName, int productId, Enum<Amount> amount, double price) {
        this.productName = productName;
        this.productId = productId;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Objects.equals(productName, product.productName) && Objects.equals(amount, product.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productId, amount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", amount=" + amount +
                '}';
    }
}
