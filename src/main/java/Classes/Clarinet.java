package Classes;

import Behaviours.InstrumentType;

public class Clarinet extends Instruments {

    private int holes;

    public Clarinet(String colour, String material, InstrumentType type, double costPrice, double sellingprice, int holes) {
        super(colour, material, type, costPrice, sellingprice);
        this.holes = holes;
    }

    public int getHoles() {
        return holes;
    }

    public void setHoles(int holes) {
        this.holes = holes;
    }

    public String playInstrument(){
        return "Clarinet blowing";
    }
}
