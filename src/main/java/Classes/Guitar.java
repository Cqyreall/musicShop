package Classes;

import Behaviours.InstrumentType;

public class Guitar extends Instruments{

    private int numberOfStrings;


    public Guitar(String colour, String material, InstrumentType type, double costPrice, double sellingprice, int numberOfStrings) {
        super(colour, material, type, costPrice, sellingprice);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String playInstrument(){
        return "Guitar strummed";
    }
}
