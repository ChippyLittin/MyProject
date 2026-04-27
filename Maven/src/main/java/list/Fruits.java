



package list;

import java.util.ArrayList;
import java.util.Collections;
public class Fruits {
    public static void main(String[] args) {

        // 1. Create ArrayList and add fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("avacado");

        System.out.println("ArrayList: " + fruits);

        // 2. Retrieve element at a specified index
        String element = fruits.get(2);
        System.out.println("Element at index 2: " + element);

        

        // 4. Remove the third element (index 2)
        fruits.remove(2);
        System.out.println("After removing third element: " + fruits);

        System.out.println(fruits.contains("Apple"));
        
        //sort array list
        Collections.sort(fruits);
        System.out.println("Asending order: "+fruits);
        
      //array list withoutgeneric
        
        //ArrayList List=new ArrayList<>();
        //list.add(23);
        
        
        
    }
}