import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter the number of orders:");
        int numberOfOrders = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        List<SalesPerson> salesPersons = new ArrayList<>();

        for (int i = 0; i < numberOfOrders; i++) {
            String[] orderDetails = scanner.nextLine().split(",");

            int orderNo = Integer.parseInt(orderDetails[0]);
            String paymentType = orderDetails[1];
            Date purchasedDate = dateFormat.parse(orderDetails[2]);
            String salesPersonName = orderDetails[3];

            System.out.println("Enter the number of purchases:");
            int numberOfPurchases = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            List<Purchase> purchaseList = new ArrayList<>();

            for (int j = 0; j < numberOfPurchases; j++) {
                String[] purchaseDetails = scanner.nextLine().split(",");
                String productName = purchaseDetails[0];
                int quantity = Integer.parseInt(purchaseDetails[1]);

                // Find product by name
                Product product = null;
                for (Product p : Product.prefill()) {
                    if (p.getName().equals(productName)) {
                        product = p;
                        break;
                    }
                }

                if (product != null) {
                    Purchase purchase = new Purchase(quantity, product);
                    purchaseList.add(purchase);
                }
            }

            Order order = new Order(orderNo, paymentType, purchasedDate, purchaseList);

            // Check if the salesperson already exists
            SalesPerson salesPerson = null;
            for (SalesPerson sp : salesPersons) {
                if (sp.getName().equals(salesPersonName)) {
                    salesPerson = sp;
                    break;
                }
            }

            if (salesPerson == null) {
                salesPerson = new SalesPerson(salesPersonName, new ArrayList<>());
                salesPersons.add(salesPerson);
            }

            salesPerson.getOrderList().add(order);
        }

        SalesPerson bestSalesPerson = SalesPerson.getBestSalesPerson(salesPersons);

        if (bestSalesPerson != null) {
            System.out.println("The best salesperson is " + bestSalesPerson.getName());
        } else {
            System.out.println("No best salesperson found.");
        }

        scanner.close();
    }
}
