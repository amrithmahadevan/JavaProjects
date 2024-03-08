package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		lst.add("Master");
		lst.add(null);
		lst.add("Blaster");
		System.out.println(lst);

		for (String str : lst) {
			System.out.println(lst);
		}
	}

}
