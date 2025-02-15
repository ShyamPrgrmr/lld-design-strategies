package lld.design.patterns.iterator;

public class ArrayL implements Aggregator{

    private int array[];
    private int size; 

    public ArrayL(int size){
        this.array = new int[10]; 
        this.size = 0;  
    }

    @Override
    public void addElement(int element){
        array[size] = element; 
        this.size++;
    }

    @Override
    public int elementAt(int pos){
        return this.array[pos]; 
    }

    @Override
    public int getSize(){
        return size; 
    }

    @Override
    public Iterator createIterator() {
        return new ArrayLIterator(this);
    }
}
