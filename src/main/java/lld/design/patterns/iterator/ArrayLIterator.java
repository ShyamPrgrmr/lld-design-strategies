package lld.design.patterns.iterator;

public class ArrayLIterator implements Iterator{
    private ArrayL aggr; 
    private int current; 
    
    public ArrayLIterator(ArrayL aggr){
        this.aggr = aggr;
        this.current = 0;   
    }
    @Override
    public boolean hasNext() {
        int size = aggr.getSize(); 
        if(current<size){
            return true; 
        }
        return false; 
    }

    @Override
    public int next() {
        if(hasNext()){
            int element = aggr.elementAt(current); 
            current++;
            return element; 
        }
        return 0;
    }

}
