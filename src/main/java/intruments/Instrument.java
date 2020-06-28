package intruments;

public abstract class Instrument {

    private String brand;
    private String color;

    public Instrument(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public String getColor() {
        return color;
    }
}
