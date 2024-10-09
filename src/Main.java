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


public class Main {
    public static void main(String[] args) {
        Product jajo = new Product("Jajko", "Jedzenie", "email@gmail.com", 8.5, 12);

        jajo.restock();
    }
}