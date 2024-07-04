import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class SalesPerson {
    private String name;
    private List<Order> orderList;

    public SalesPerson(String name, List<Order> orderList) {
        this.name = name;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public static SalesPerson getBestSalesPerson(List<SalesPerson> list) {
        SalesPerson bestSalesPerson = null;
        
        int max = Integer.MAX_VALUE;

        for (SalesPerson s : list) {
            List<Order> orders = s.getOrderList();

            if(orders == null) continue;
            int valuableCount = 0;

            for (Order o : orders) {
                
                if (o.getAmount() > 500.0) {
                    valuableCount++;
                }
                    
                if (valuableCount > max) {
                    bestSalesPerson = s;
                    max = valuableCount;
                }

            }
        }
        return bestSalesPerson;
    }

    public static List<SalesPerson> prefill() {
        // Prefill with sample data
        // Create products
        List<Product> products = Product.prefill();

        // Create purchases
        List<Purchase> purchases1 = new ArrayList<>();
        purchases1.add(new Purchase(2, products.get(0)));
        purchases1.add(new Purchase(1, products.get(1)));
        purchases1.add(new Purchase(1, products.get(2)));
        purchases1.add(new Purchase(1, products.get(3)));

        List<Purchase> purchases2 = new ArrayList<>();
        purchases2.add(new Purchase(2, products.get(4)));
        purchases2.add(new Purchase(3, products.get(5)));
        purchases2.add(new Purchase(3, products.get(6)));

        // Create orders
        List<Order> orders1 = new ArrayList<>();
        orders1.add(new Order(12, "Debit Card", new Date(), purchases1));

        List<Order> orders2 = new ArrayList<>();
        orders2.add(new Order(10, "Paytm", new Date(), purchases2));

        // Create salespersons
        List<SalesPerson> salesPersons = new ArrayList<>();
        salesPersons.add(new SalesPerson("Oliver", orders1));
        salesPersons.add(new SalesPerson("Barry", orders2));

        return salesPersons;
    }
}
