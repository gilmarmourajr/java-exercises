
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if((item.getWeight() + this.totalWeight()) <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for(Item item : this.items) {
            System.out.println(item + "\n");
        }
    }
    
    public int totalWeight() {
        if(this.items.isEmpty()) {
            return 0;
        }
        
        if(this.items.size() == 1) {
            return this.items.get(0).getWeight();
        }
        
        int weight = 0;
        for(Item item : this.items) {
            weight += item.getWeight();
        }
        
        return weight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        if(this.items.size() == 1) {
            return this.items.get(0);
        }
        
        Item heaviest = this.items.get(0);
        for(Item item : this.items) {
            if(heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
