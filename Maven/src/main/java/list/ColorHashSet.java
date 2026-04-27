package list;

import java.util.HashSet;
import java.util.Iterator;

		public class ColorHashSet {
		    public static void main(String[] args) {

		        // Create a HashSet of colors
		        HashSet<String> colors = new HashSet<>();

		        // Add colors
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");
		        colors.add("Red"); 
		        
		        // Display HashSet
		        System.out.println("Colors in HashSet: " + colors);

		        // Check if a color exists
		        colors.contains("Green") ;
		            System.out.println("Green is present");
		        

		        // Remove a color
		        //colors.remove("Yellow");
		        //System.out.println("After removing Yellow: " + colors);

		        // Size of HashSet
		        System.out.println("Number of colors: " + colors.size());

		        // Iterate through HashSet
		        System.out.println("Iterating colors:");
		        for (String color : colors) {
		            System.out.println(color);
		        }

		        // Clear all elements
		       // colors.clear();
		        //System.out.println("After clearing: " + colors);
		    
		    System.out.println("using Iterator:");
	        Iterator<String> it = colors.iterator();

	        while (it.hasNext()) {
	            String color = it.next();
	            System.out.println(color);
	        }

		
	

}
}
