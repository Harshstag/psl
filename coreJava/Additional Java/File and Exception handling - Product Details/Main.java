import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> validProducts = new ArrayList<>();
        boolean invalidEmailExceptionThrown = false;
        String invalidEmailMessage = "";

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            ProductDAO productDAO = new ProductDAO();
            validProducts = productDAO.obtainProductListFromFile(br);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display valid products
        ProductDAO productDAO = new ProductDAO();
        productDAO.displayProducts(validProducts);
    }
}
 