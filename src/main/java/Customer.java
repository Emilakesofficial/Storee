import java.util.ArrayList;
import java.util.List;

public class Customer implements CusInterface {
    private String name;
    private double balance;
    private List<Product>PurchasedItems;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.PurchasedItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Product> getPurchasedItems() {
        return PurchasedItems;
    }

    public void setPurchasedItems(List<Product> purchasedItems) {
        PurchasedItems = purchasedItems;
    }


    @Override
    public double calculateTotalBalance() {
        double totalAmount = 0;
        for (Product product: getPurchasedItems()) {
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }

    @Override
    public double removeFromBalance(double totalAmount) {
        if (balance - totalAmount <= 0) {
            System.out.println("INSUFFICIENT BALANCE, PLEASE ADD TO BALANCE TO COMPLETE TRANSACTION");
        }else{
            balance =- totalAmount;
            System.out.println("TRANSACTION SUCCESSFUL");
        }
        return totalAmount;
    }

    @Override
    public void addPurchasedItems(Product product) {
        PurchasedItems.add(product);
    }
}
