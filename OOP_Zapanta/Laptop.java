public class Laptop {
    private String brand;
    private double price;
    private int storage;

    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }
    
    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        if (storage > 0) {
            this.storage = storage;
        } else {
            System.out.println("Storage should be greater than 0");
        }
    }

    
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setPrice(75000);
        laptop.setStorage(-1);

        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Price: " + laptop.getPrice());
        System.out.println("Storage: " + laptop.getStorage() + " GB");
    }
}
