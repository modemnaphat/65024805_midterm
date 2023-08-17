public class main {
    public static void main(String[] args) {
        
        Product p = new Product("chair", 500.0);
        Electronics e = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
        Smartphone s = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book book = new Book("OOP Programming", 250.0, "John Doe", 300);

        p.displayDetail();
        e.displayDetail();
        s.displayDetail();
        book.displayDetail();
    }
}

class Product{
    public String name;
    public double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String setName(String name){
        return name;
    }
    public double getPrice(){
        return this.price;
    }
    public double setPrice(double price){
        return price;
    }
    public void displayDetail(){
        System.out.println();
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
        int daisies = 29;
         for (int i = 1; i <= daisies; i++) {
            System.out.print("*");
        }
    }
}

class Electronics extends Product{
    public String brand;
    public String model;

    Electronics(String name, double price, String brand,String model){
        super(name, price);
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){
        return this.brand;
    }
    public String setBrand(String brand){
        return brand;
    }
    public String getModel(){
        return this.brand;
    }
    public String setModel(String model){
        return brand;
    }
    public void displayDetail(){
        System.out.println();
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        int daisies = 29;
         for (int i = 1; i <= daisies; i++) {
            System.out.print("*");
        }
    }
}

class Smartphone extends Electronics{
    private String OperatingSystem;

    Smartphone(String name, double price, String brand,String model,String OperatingSystem){
        super(name, price, brand, model);
        this.OperatingSystem = OperatingSystem;
    }
    public String getOpsystem(){
        return this.OperatingSystem;
    }
    public String setOpsystem(String OperatingSystem){
        return OperatingSystem;
    }
    public void displayDetail(){
        System.out.println();
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Operating System : " + this.OperatingSystem);
        int daisies = 29;
         for (int i = 1; i <= daisies; i++) {
            System.out.print("*");
        }
    }
}

class Book extends Product{
    private String author;
    private int pages;

    Book(String name,double price,String author, int pages){
        super(name, price);
        this.author = author;
        this.pages = pages;
    }
    public String getAuthor(){
        return this.author;
    }
    public String setAuthor(String author){
        return author;
    }
    public int getPages(){
        return this.pages;
    }
    public int setPages(int pages){
        return pages;
    }
    public void displayDetail(){
        System.out.println();
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
        System.out.println("Author : " + this.author);
        System.out.println("Number of Pages : " + this.pages);
        int daisies = 29;
         for (int i = 1; i <= daisies; i++) {
            System.out.print("*");
        }
    }
}