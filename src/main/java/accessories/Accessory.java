package accessories;

public abstract class Accessory {

    private String brand;
    private double price;

    public Accessory(String brand, double price){

        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
