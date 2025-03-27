public class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int [] quantities;
    private String orderDate;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


     public int calculateTotalValue() {
       int sum = 0;
       for (int i = 0; i < products.length; i++) {
           sum += products[i].getPrice()* quantities[i];
       }
       System.out.println("Total order value "+ sum);
       return sum;
     }


     public void applyDiscount () {
         double DiscountPriceOfOrder = 0;
         if (customer.getLoyalCustomer()) {



             for (int i = 0; i < products.length; i++) {
                products[i].setPrice(products[i].getPrice()*0.9);
             }
             System.out.println("Total order value " + calculateTotalValue());
         }


     }

     public void displayDetails() {
        System.out.println("ID:" + id );

         System.out.println();
         System.out.println("Customer:");
        customer.displayInfo();
         System.out.println("Products:");

        for (int i = 0; i < products.length; i++) {
             System.out.println();
            products[i].displayInfo();
            System.out.println("Quantities:" + quantities[i]);
        }
        System.out.println("Date:"+ orderDate);
        System.out.println("Status:"+ status);
        System.out.println();
        System.out.println("Total Price:" + calculateTotalValue());





     }

}
