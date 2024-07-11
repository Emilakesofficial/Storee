import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import java.io.Serializable;

public class Product implements Serializable {
//    @CsvBindByPosition(position = 0)
    private String brandName;

//    @CsvBindByPosition(position = 1)
    private double price;

//    @CsvBindByPosition(position = 2)

    public Product(String brandName, double price) {
        this.brandName = brandName;
        this.price = price;
    }

    public Product() {
    }

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }



    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}
