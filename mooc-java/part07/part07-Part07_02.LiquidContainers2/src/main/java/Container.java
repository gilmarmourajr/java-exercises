/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juzin
 */
public class Container {
    private int current;
    private int max;
    
    public Container() {
        current = 0;
        max = 100;
    }
    
    public int contains() {
        return current;
    }
    
    public void add(int amount) {
        if(amount > 0) {
            current += amount;
        }
        
        if(current > max) {
            current = max;
        }
    }
    
    public void remove(int amount) {
        if(amount > 0) {
            current -= amount;
        }
        
        if(current < 0) {
            current = 0;
        }
    }
    
    public String toString() {
        return current+"/"+max;
    }
}
