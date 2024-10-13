package assignment3;

public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        productCatalog = new ProductCatalog();
        paymentProcessor = new PaymentProcessor();
        inventoryManager = new InventoryManager();
        shippingService = new ShippingService();
    }

    public void placeOrder(String product, String paymentType) {
        System.out.println("Performs search and selection of products...");
        productCatalog.searchProduct(product);
        if (productCatalog.isProductAvailable(product)) {
            productCatalog.selectProduct(product);
            System.out.println("Checks the availability of goods in the warehouse...");
            if (inventoryManager.checkStock(product)) {
                double price = productCatalog.getProductPrice(product);
                System.out.println("Manages payments and processes transactions...");
                paymentProcessor.processPayment(paymentType, price);
                System.out.println("Calculates shipping costs and processes order delivery...");
                shippingService.calculateShipping(product);
                shippingService.shipProduct(product);
                System.out.println("The order has been successfully placed for: " + product);
            } else {
                System.out.println("The product is out of stock..(");
            }
        } else {
            System.out.println("The product is not available for order..(");
        }
    }
}