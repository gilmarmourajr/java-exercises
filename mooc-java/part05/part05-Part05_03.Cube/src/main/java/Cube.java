public class Cube {
    private int edge;
    
    public Cube(int edgeLength){
        this.edge = edgeLength;
    }
    
    public int volume(){
        return edge * edge * edge;
    }
    
    public String toString(){
        return "The length of the edge is "+this.edge+" and the volume is "+this.volume();
    }
}
