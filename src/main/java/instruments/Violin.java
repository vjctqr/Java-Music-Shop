package instruments;

import behaviours.IPlay;

public class Violin extends Instrument implements IPlay {

    private String brand;
    private String color;
    private double price;

    public Violin(String brand, String color, double price){
        super(brand, color, price);
    }

    public String playedSound(String data){
        return playSound(data);
    }

}
