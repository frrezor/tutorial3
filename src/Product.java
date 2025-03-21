public class Product {

    private int id;
    private String name;
    private String  category;
    private double price;
    private int stockQuantity;

    public void setId(int id) {
        // validate if id > 5000
        this.id = id;
    }
     public  int getId() {
        return this.id;
     }
      public void setName(String name) {
        this.name= name;
      }
      public String getName() {
        return this.name;
      }
      public void setCategory(String category) {
        this.category = category;
      }
      public String getCategory() {
        return this.category;
      }
      public void setPrice(double price) {
        this.price= price;
      }
      public double getPrice() {
        return this.price;
      }
      public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
      }
      public int getStockQuantity() {
        return this.stockQuantity;
      }
      public void displayInfo () {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Category: " + this.category);
        System.out.println("Price: " + this.price);
        System.out.println("Stock Quantity: " + this.stockQuantity);
      }
}
