

package list;

import java.util.ArrayList;

public class List{
	
	public static void main(String[] args)
	{
	ArrayList <String>list= new ArrayList();
	
	list.add("green");
	list.add("yellow");
	list.add("white");
	list.add("purple");
	System.out.println(list);
	
	list.add(0,"blue");
	System.out.println("after adding :"+list);
	
	System.out.println("Get the element :"+list.get(3));
	
	list.set(1, "rose");  //update the colr green to rose
	System.out.println("update the element :"+list);
	
	list.remove(2);
	
	System.out.println("after removing :"+list);
	
	System.out.println(list.contains("green"));
	
	System.out.println(list.size());
	
	//list.clear();  //clear the element
	//System.out.println(list);
	System.out.println();
	ArrayList <String>list1= new ArrayList();
	list1.add("violet");
	list1.add("blue");
	list1.add("green");
	list1.add("orange");
	//list.addAll(list1); //addAll combining all the list
	//System.out.println("combining the two list   :"+list);
	
	//list.removeAll(list1);
	//System.out.println(list1);
	
	System.out.println(list.containsAll(list1));    //check the both list is combined
	
	list.retainAll(list1);
	System.out.println("after retain :"+list);
	
	
	
    
    
	
	}
	}


