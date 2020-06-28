package instruments;

import behaviours.IPlay;

public class DrumSet extends Instrument implements IPlay {

    private String brand;
    private String color;
    private double price;

    public DrumSet(String brand, String color, double price){
        super(brand, color, price);
    }

    public String playSound(String data){
        return playSound(data);
    }

}
