package sda.org.sklep;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter

public class Storage implements Operation {

    List<Product> products = new ArrayList<>();


    @Override
    public void addProduct(Product product) {
        if (!products.contains(product)) {
            System.out.println("Product" + product.getProductName() + " added to storage");
            products.add(product);
        }else {
            System.out.println("Product exists in storage: " + product);
        }
    }

    @Override
    public void removeProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
        } else {
            System.out.println("Product" + product.getProductName() + "doesn't exist");
        }
    }

    @Override
    public void listOfProducts() {
        System.out.println("List of products: \n" + products);
    }




}
