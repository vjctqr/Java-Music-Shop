package instruments;

public abstract class Instrument {

    private String brand;
    private String color;
    private double price;

    public Instrument(String name, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getName(){
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public double getPrice(){
        return this.price;
    }
}
