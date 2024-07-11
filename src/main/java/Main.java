import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvBadConverterException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    //    private static final String SAMPLE_CSV_FILE_PATH = "./ProductData.csv";
    public static void main(String[] args) throws IOException {
//        Cashier cashier = new Cashier("KATE", "female", 17);
//        Cashier cashier2 = new Cashier("HARRY", "male", 23);
//        Cashier cashier3 = new Cashier("PEARL", "female", 30);
//
//        Manager manager = new Manager("BOB", "male", 46);
//        manager.hireCashier(cashier);
//        manager.hireCashier(cashier2);
//        manager.hireCashier(cashier3);

//        Cashier cashier = new Cashier("HARRY", "male", 23);
//
//        Customer David = new Customer("DAVID", 2000);
//        Product Gucci = new Product("Gucci", 200, 2);
//        Product Prada = new Product("Prada", 50, 4);
//        Product Adidas = new Product("Adidas", 150, 3);
//
//        David.addPurchasedItems(Gucci);
//        David.addPurchasedItems(Prada);
//        David.addPurchasedItems(Adidas);
//        cashier.printReceipt(David);
//        David.calculateTotalBalance();
//        David.removeFromBalance(David.calculateTotalBalance());
//        cashier.printMessage(David);
        LinkedList<Product> store = new LinkedList<>();
        Product gucciShirt = new Product();
        gucciShirt.setBrandName("Gucci Shirt");
        gucciShirt.setPrice(40);

        Product gucciPants = new Product();
        gucciPants.setBrandName("Gucci Pants");
        gucciPants.setPrice(60);

        Product gucciPolo = new Product();
        gucciPolo.setBrandName("Gucci Polo");
        gucciPolo.setPrice(40);

        Product lv = new Product();
        lv.setPrice(20); lv.setBrandName("LV");

        Product prada = new Product();
        prada.setBrandName("Prada");
        prada.setPrice(30);

        store.add(gucciShirt);
        store.add(gucciPolo);
        store.add(gucciPants);
        store.add(lv);
        store.add(prada);
        for (Product p : store) {
            System.out.println("Name:" + p.getBrandName() + " Price: " + p.getPrice());
        }
        try {
            FileOutputStream fout = new FileOutputStream("ProductData.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(store);
            System.out.println(store);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Cashier cashier = new Cashier("Dave", "male", 23);
        Customer customer = new Customer("Aj", 150);
        customer.addPurchasedItems(gucciPants);
        customer.addPurchasedItems(prada);
        customer.addPurchasedItems(gucciPolo);
        customer.calculateTotalBalance();
        System.out.println("Total Amount: " + customer.calculateTotalBalance());
        customer.removeFromBalance(customer.calculateTotalBalance());
        cashier.printReceipt(customer);

    }
}
