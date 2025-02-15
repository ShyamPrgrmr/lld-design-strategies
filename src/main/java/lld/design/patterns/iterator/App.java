package lld.design.patterns.iterator;

public class App {
    public static void main(String[] args) {
        ArrayL arraylist = new ArrayL(10); 
        
        arraylist.addElement(10);
        arraylist.addElement(20);
        arraylist.addElement(30);
        arraylist.addElement(40);
        arraylist.addElement(50);
        
        Iterator iterator = arraylist.createIterator(); 
        while (iterator.hasNext()) {
            System.out.println(iterator.next());    
        }
    }
}
