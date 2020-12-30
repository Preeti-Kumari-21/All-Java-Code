package Core_Java_in28minutes.Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*List once created it will be immutable. We cannot add any values to it. 
Now if you want to make a mutable list, convert the list to either of the following
Arraylist
LinkedList
Vector. 
List is immutable
Arraylist, Linkedlist, Vector are mutable...*/

public class ListExample2 {

	public static void main(String[] args) {

		List<String> words = List.of("Apple", "Bat", "Cat");

		// This is not possible as List once created cannot be changed..
		// words.add("Dog");

		List<String> wordsInArrayList = new ArrayList<String>(words);
		wordsInArrayList.add("Dog");

		System.out.println(wordsInArrayList);

		List<String> wordsOfLinkedList = new LinkedList<String>(words);
		wordsOfLinkedList.add("Dog");

		System.out.println(wordsOfLinkedList);

		List<String> wordsOfVector = new Vector<String>(words);
		wordsOfVector.add("Dog");

		System.out.println(wordsOfVector);

	}

}
