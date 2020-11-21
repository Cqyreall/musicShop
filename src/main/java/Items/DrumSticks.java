package Items;

import Behaviours.ISell;

public class DrumSticks implements ISell {

    private String name;
    private double costPrice;
    private double sellingPrice;

    public DrumSticks(String name, double costPrice, double sellingPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup(){
        return ((sellingPrice - costPrice) / (costPrice)) * 100;
    }
}
