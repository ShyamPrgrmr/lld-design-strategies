package lld.design.patterns.iterator;

public interface Aggregator {
    public Iterator createIterator();
    public void addElement(int element);
    public int elementAt(int pos);
    public int getSize(); 
}
