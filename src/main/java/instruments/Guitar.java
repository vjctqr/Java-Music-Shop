package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private String brand;
    private String color;
    private double price;

    public Guitar(String brand, String color, double price){
        super(brand, color, price);
    }

    public String playedSound(String data) {
        return playSound(data);
    }

}
