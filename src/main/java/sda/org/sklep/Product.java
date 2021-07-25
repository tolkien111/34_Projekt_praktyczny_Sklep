package sda.org.sklep;

import lombok.Getter;


import java.util.Objects;

@Getter

public class Product {

    private String productName;
    private int productId;
    private Enum <KindOfAmount> kindOfAmount;
    private double price;

    public Product(String productName, int productId, Enum<KindOfAmount> kindOfAmount, double price) {
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
                ", amount=" + kindOfAmount +
                '}';
    }
}
