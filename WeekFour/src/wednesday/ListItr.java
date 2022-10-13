package wednesday;

import java.util.*;
public class ListItr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> newList = new ArrayList<String>();
		
		newList.add("Mango");
		newList.add("Apple");
		newList.add("Banana");
		newList.add("Orange");
		
		System.out.println("List: " + newList);
		
        // Create a ListIterator Object (Refer to the Official Oracle documentation if needed) 
		ListIterator<String> itr = newList.listIterator();
		//  Print out the elements using while loop. Hint: use hasNext() and nextIndex() method
		while (itr.hasNext()) {
			System.out.println("Value at " + itr.nextIndex() + " is " + itr.next());
		}
        
	}

}