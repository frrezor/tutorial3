public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void setIsLoyalCustomer(boolean loyalCustomer) {
        isLoyalCustomer = loyalCustomer;
    }
     public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Loyal Customer: " + isLoyalCustomer);
     }
}
