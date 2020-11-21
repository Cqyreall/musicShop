package Classes;

import Behaviours.InstrumentType;

public class Xylophone extends Instruments {

    private int keys;

    public Xylophone(String colour, String material, InstrumentType type, double costPrice, double sellingprice, int keys) {
        super(colour, material, type, costPrice, sellingprice);
        this.keys = keys;
    }


    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String playInstrument(){
        return "Bruhhh!";
    }
}
