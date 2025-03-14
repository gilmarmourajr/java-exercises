
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = suitcase.totalWeight();
        if(!this.hold.isEmpty()) {
            for(Suitcase sc : this.hold) {
                totalWeight += suitcase.totalWeight();
            }
        }
        if(totalWeight <= maxWeight) {
            this.hold.add(suitcase);
        }
    }
    
    public void printItems() {
        for(Suitcase sc : this.hold) {
            sc.printItems();
        }
    }
    
    public String toString() {
        if(this.hold.isEmpty()) {
            //return "no suitcases (0 kg)";
            return "0 suitcases (0 kg)";
        }
        
//        if(this.hold.size() == 1) {
//            return "1 suitcase (" + this.hold.get(0).totalWeight() + " kg)";
//        }
        
        int totalWeight = 0;
        for(Suitcase sc : this.hold) {
            totalWeight += sc.totalWeight();
        }
        
        return this.hold.size() + " suitcases (" + totalWeight + " kg)";
    }
}
