package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cat");
		list.add("Banana");
		list.add("Dog");
		System.out.println(list);
		
		Iterator itob= list.iterator();				//iterator
		while(itob.hasNext()) {
			System.out.println(itob.next());
		}
		
		//removing
		list.remove(3);
		System.out.println(list);
		//to get an element fromt the array
		System.out.println(list.get(3));
		//to check the whether the element is present or not- returns boolean
		System.out.println(list.contains("Cat"));
		//to remove all the elements.
		list.removeAll(list);
		System.out.println(list);
		
		System.out.println(" ");	
		
		//Numbers in array
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(5);
		list1.add(5);
		list1.add(6);
		System.out.println(list1);
		System.out.println(list1.size());			//finding the size
		list1.addAll(list1);						//adding 
		System.out.println(list1);
		System.out.println(list1.size());
		
		
		
		
	}

}
