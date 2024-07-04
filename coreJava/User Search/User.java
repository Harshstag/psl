import java.util.Objects;

public class User implements Comparable<User> {
    private String username;
    private String bankname;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(String username, String bankname) {
        this.username = username;
        this.bankname = bankname;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    // Override equals and hashCode based on username
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    // Implement Comparable interface to sort by username
    @Override
    public int compareTo(User other) {
        return this.username.compareTo(other.username);
    }
}
