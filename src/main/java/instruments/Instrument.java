package instruments;

public abstract class Instrument {

    private String brand;
    private String color;
    private double price;

    public Instrument(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice(){
        return price;
    }
}
