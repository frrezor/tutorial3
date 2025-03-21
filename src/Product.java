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
}
