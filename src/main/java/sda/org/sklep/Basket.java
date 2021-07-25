package sda.org.sklep;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Basket implements Operation{

    List <Product> products;
    List <Product> productList = new ArrayList<>();

    public Basket(List<Product> products) {
        this.products = products;
    }

    @Override
    public void addProduct(Product product) {
        if (products.contains(product)){
            productList.add(product);
        } else {
            System.out.println("Product " + product.getProductName() + " is not available");
        }

    }

    @Override
    public void removeProduct(Product product) {
        if (products.contains(product)){
            productList.remove(product);
        } else {
            System.out.println("Product " + product.getProductName()+ " is not in the basket");
        }
    }

    @Override
    public void listOfProducts() {
        System.out.println("List of products: \n" + productList);

    }
}
