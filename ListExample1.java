package Core_Java_in28minutes.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Orange", "Mango");


		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Mango");
		list1.add("Orange");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Apple");
		list2.add("Mango");
		list2.add("Orange");


		List<String> list3 = new ArrayList<String>(list2);
		
		for (String element : list) {
			System.out.println(element);


		}

		System.out.println(list.get(0));
		System.out.println(list.contains("Pears"));
		System.out.println(list.indexOf("Pears"));

	}

}
