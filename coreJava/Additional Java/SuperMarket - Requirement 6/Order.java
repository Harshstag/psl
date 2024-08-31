import java.util.Date;
import java.util.List;

public class Order {
    private int orderNo;
    private String paymentType;
    private double amount;
    private Date purchasedDate;
    private List<Purchase> purchaseList;

    public Order(int orderNo, String paymentType, Date purchasedDate, List<Purchase> purchaseList) {
        this.orderNo = orderNo;
        this.paymentType = paymentType;
        this.purchasedDate = purchasedDate;
        this.purchaseList = purchaseList;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public void calculateAmount() {
        this.amount = 0;
        for (Purchase p : purchaseList) {
            this.amount += p.getQuantity() * p.getProduct().getPrice();
        }
    }
}
