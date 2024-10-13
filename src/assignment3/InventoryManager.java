package assignment3;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> stock;

    public InventoryManager() {
        stock = new HashMap<>();
        stock.put("Blush", 480);
        stock.put("Bronzer", 400);
        stock.put("Eyeliner", 15);
        stock.put("Lipstick", 0);
        stock.put("Cream", 1);
    }


    public boolean checkStock(String product) {
        for (String key : stock.keySet()) {
            if (key.equalsIgnoreCase(product)) {
                int quantity = stock.get(key);
                if (quantity > 0) {
                    System.out.println("Stock available for product: " + product);
                    return true;
                } else {
                    System.out.println("Product is out of stock: " + product);
                    return false;
                }
            }
        }
        System.out.println("Product not found in inventory: " + product);
        return false;
    }
}