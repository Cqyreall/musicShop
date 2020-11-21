package Classes;

import Behaviours.IPlay;
import Behaviours.ISell;
import Behaviours.InstrumentType;
public abstract class Instruments implements IPlay, ISell {

    private String colour;
    private String material;
    private InstrumentType type;
    private double costPrice;
    private double sellingprice;

    public Instruments(String colour, String material, InstrumentType type, double costPrice, double sellingprice) {
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.costPrice = costPrice;
        this.sellingprice = sellingprice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public abstract String playInstrument();

    public double calculateMarkup(){
        return ((this.sellingprice - this.costPrice) / (this.costPrice)) * 100;
    }
}
