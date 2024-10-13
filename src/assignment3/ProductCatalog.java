package assignment3;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<String, Double> products;

    public ProductCatalog() {
        products = new HashMap<>();
        products.put("Blush", 36.44);
        products.put("Bronzer", 40.00);
        products.put("Eyeliner", 12.87);
        products.put("Lipstick", 25.1);
        products.put("Cream", 34.44);
    }

    public void searchProduct(String product) {
        if (products.containsKey(product)) {
            System.out.println("Performs a product search: " + product);
        } else {
            System.out.println("Product not found: " + product);
        }
    }

    public void selectProduct(String product) {
        if (products.containsKey(product)) {
            System.out.println("Product selected: " + product);
        } else {
            System.out.println("Product is not available: " + product);
        }
    }

    public Double getProductPrice(String product) {
        return products.get(product);
    }

    public boolean isProductAvailable(String product) {
        return products.containsKey(product);
    }
}