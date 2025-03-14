
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<String>();
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        return stack;
    }
    
    public String take() {
        String taker = this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return taker;
    }
}
