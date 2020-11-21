package Classes;

import Behaviours.InstrumentType;

public class Trumpet extends Instruments {

    private int numberOfValves;

    public Trumpet(String colour, String material, InstrumentType type, double costPrice, double sellingprice, int numberOfValves) {
        super(colour, material, type, costPrice, sellingprice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public String playInstrument(){
        return "Blow your trumpet";
    }

}
