public class ComputerStore { private Product[] products = new Product[100];
    private Customer[] customers = new Customer[100];
    private Order[] orders = new Order[100];
    private int productCount=0;
    private int customerCount=0;
    private int orderCount=0;

    public void addProduct(Product product) {
        products[productCount++] = product;
    }
    public void addCustomer(Customer customer) {
        customers[customerCount++] = customer;
    }

    public Order createOrder(Customer customer,Product [] products, int[] quantities) {
        Order order = new Order ();
        order.setId(orderCount+1);
        order.setCustomer(customer);
        order.setProducts(products);
        order.setQuantities(quantities);
        order.setOrderDate(java.time.LocalDate.now().toString());
        order.setStatus("New");
        orders[orderCount++] = order;
        return order;
    }
    public void updateStockAfterOrder (Order order) {
        Product[] orderedProducts = order.getProducts();
        int[] quantities = order.getQuantities();

        for (int i = 0; i < orderedProducts.length; i++) {
            Product product = orderedProducts[i];
            product.setStockQuantity(product.getStockQuantity() - quantities[i]);
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].getId() == orderId) {
                orders[i].setStatus(newStatus);
            }
        }
    }
    public void displayProductsInCategory(String category) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategory().equalsIgnoreCase(category)) {
                products[i].displayInfo();
            }
        }
    }

    public void displayCustomerOrders(int customerId) {
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].getCustomer().getId() == customerId) {
                orders[i].displayDetails();
            }
        }
    }
}
