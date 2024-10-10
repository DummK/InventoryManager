class Product {
    private String name;
    private String category;
    private String supplierEmail;
    private double price;
    private int stockQuantity;

    public Product(String name, String category, String supplierEmail, double price, int stockQuantity) {
        this.name = name;
        this.category = category;
        this.supplierEmail = supplierEmail;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public String getSupplierEmail() {
        return supplierEmail;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    public void restock() {
        System.out.println("Uzupełniono zapasy");
    }
    public void sell() {
        if(stockQuantity <= 0) {
            System.out.println("Nie ma wystarczającej liczby produktów");
        }
        else {
            System.out.println("Sprzedaż udana");
        }
    }
}

class InventoryManager extends Product {
    private String department;
    private int managedProductsCount;
    private boolean isLoggedIn;

    public InventoryManager(String department, int managedProductsCount, boolean isLoggedIn, String name, String category, String supplierEmail, double price, int stockQuantity) {
        super(name, category, supplierEmail, price, stockQuantity);
        this.department = department;
        this.managedProductsCount = managedProductsCount;
        this.isLoggedIn = isLoggedIn;
    }

    public void logIn() {
        isLoggedIn = true;
        System.out.println("Zalogowano");
    }
    public void logOut() {
        isLoggedIn = false;
        System.out.println("Wylogowano");
    }
    public void assignProduct() {
        System.out.println("\nPrzypisano nowy produkt");
        managedProductsCount++;
    }
    public void viewReports() {
        System.out.println("\nRaport: ");
        System.out.println("Nazwa produktu: " + getName());
        System.out.println("Kategoria produktu: " + getCategory());
        System.out.println("Email dostawcy produktu: " + getSupplierEmail());
        System.out.println("Ilość produktu: " + getStockQuantity());
    }
    public void displayManagerData() {
        System.out.println("\nDział : " + department);
        System.out.println("Ilość przypisanych produktów : " + managedProductsCount);
    }
}

public class Application {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager("Sklep spożywczy", 1, false, "Jajco", "jedzenie", "sklep@gmail.com", 11, 1000);

        manager.logIn();
        manager.assignProduct();
        manager.viewReports();
    }
}