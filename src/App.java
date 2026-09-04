import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Laptop("L001", "Macbook Pro 14", 2500, "Brand Apple"));
        list.add(new Laptop("L002", "ThinkPad X1", 1800, "Brand Lenovo"));
        list.add(new Smartphone("S001", "iPhone 15", 1200, 171));
        list.add(new Smartphone("S002", "Samsung Galaxy S23", 1100, 168));
        list.add(new Tablet("T001", "iPad Pro 12.9", 1300, 12.9));

        System.out.println("=== Product List ===");
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
