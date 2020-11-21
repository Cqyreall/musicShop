package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class ShopClass {

    private ArrayList<ISell> collections;

    public ShopClass() {
        collections = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getCollections() {
        return collections;
    }

    public void setCollections(ArrayList<ISell> collections) {
        this.collections = collections;
    }

    public void addToCollection(ISell newCollection){
        this.collections.add(newCollection);
    }

    public void removeFromCollection(ISell removeCollection){
        this.collections.remove(removeCollection);
    }

    public double profitMargin(){
        double currentProfit = 0;
        for(ISell collection : this.collections){
            double temp = collection.calculateMarkup();
            currentProfit += temp;
        }

        return currentProfit;
    }
}
