package datastructures;

//V is the value
public class HashMap{

    String array[]; 
    int size=0; 

    public HashMap(int size) throws Exception{
        if(size==0 || size<0){
            throw new Exception("Size should be greater than zero"); 
        }
        this.size = size; 
        array = new String[size]; 
    }

    private int function(int key){
        return (key*key)+2; 
    }

    public void put(int key, String value){
        int index = function(key) % this.size;
        if(array[index] == null){
            array[index] = value; 
        }else{
            System.out.println("Replacing value at index "+index);
            array[index] = value;
        }
    }

    public String get(int key){
        int index = function(key)%size; 
        return array[index]; 
    }

    public static void main(String[] args) throws Exception{
        HashMap hashMap = new HashMap(10); 

        hashMap.put(2, "Shyam");
        hashMap.put(3, "Ram");
        hashMap.put(2, "Abhijeet");
        hashMap.put(1, "Vishal");

        System.out.println("At position : " + hashMap.get(2));
        System.out.println("At position : " +hashMap.get(3));
        System.out.println("At position : " +hashMap.get(1));

        
    }
}
