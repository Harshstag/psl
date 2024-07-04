public class User {
    private String name;
    private String contactNumber;
    private String userName;
    private String email;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(String name, String contactNumber, String userName, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.userName = userName;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to display user details
    public void display() {
        System.out.printf("%-20s%-20s%-20s%-20s\n", name, contactNumber, userName, email);
    }
}
