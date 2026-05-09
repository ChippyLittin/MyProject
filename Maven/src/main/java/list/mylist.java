


package list;

import java.util.ArrayList;
import java.util.Iterator;

public class mylist {

	public static void main(String[] args) {
		
	//ArrayList <Integer>mylist=new ArrayList<Integer>();
		
		ArrayList mylist=new ArrayList();
		
		//Adding elements
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("chippy");
		mylist.add("ishin");
		mylist.add(200.3);
		mylist.add(null);
		
		//to print all the elements
		System.out.println("all the elements in the list :");
		System.out.println(mylist);
		
	//find the size of the list
		System.out.println("the size of the array elements  :");
		System.out.println(mylist.size());
		
		//rEMOVE THE ARRAYELEMENTS BASED ON THE INDEX
		
		System.out.println("remove the third index element ,After removing  :");
		mylist.remove(3);
		System.out.println(mylist);
		
		//Insert element in the arraylist based on the index
		mylist.add("blue");
		System.out.println("after adding the list: "+mylist);
		
		mylist.add(3,"blue");
		System.out.println("after adding the list: "+mylist);
		
		//modify/change the arrayelements
		mylist.set(2,"java");
		System.out.println(mylist);
		
		//Access the specific element from the arraylist
		
		System.out.println("getting the element :"+mylist.get(4));
		
		mylist.remove(3);
		

		System.out.println(mylist);
		
		//access all the elements from the list
		System.out.println("using loop");
		/*for(int i=0;i<mylist.size();i++) 
		{
			
			System.out.println(mylist.get(i));
		}*/
		for(Object x:mylist) {
			
			System.out.println(x);
			
		}
		
		System.out.println("using iterator");
		
		Iterator it=mylist.listIterator();
		
		while(it.hasNext())
		{
			
		  System.out.println(it.next());
		
		}
		
		//check the arraylist is empty or not
		
		System.out.println(mylist.isEmpty());
		
		
		//Remove one or more elements from the arraylist
		
		ArrayList mylist2=new ArrayList();
		
		mylist2.add(100);
		mylist2.add(null);
		
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		mylist.clear();
		System.out.println(mylist);
		
		
		
		
		
		
	
		
		

	}

}
