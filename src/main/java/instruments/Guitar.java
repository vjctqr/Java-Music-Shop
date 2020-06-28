package instruments;

public class Guitar extends Instrument {

    private String brand;
    private String color;
    private double price;

    public Guitar(String brand, String color, double price){
        super(brand, color, price);
    }
}
