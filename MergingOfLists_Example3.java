package Core_Java_in28minutes.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MergingOfLists_Example3 {

	public static void main(String[] args) {

		List<String> words = List.of("Apple", "Orange", "Mango");

		List<String> wordsOfArray = new ArrayList<String>(words);

		List<String> wordsOfVector = new Vector<String>(words);

		List<String> wordsOfLinkedList = new LinkedList<String>(words);

		wordsOfArray.addAll(3, wordsOfVector);

		wordsOfArray.addAll(6, wordsOfLinkedList);

		System.out.println(wordsOfArray);

		
		for (int i = 0; i <= wordsOfArray.size() - 1; i++) {
			System.out.println(wordsOfArray.get(i));
		}

		for (String s : wordsOfArray) {
			System.out.println(s);

		}

		for (Object element : wordsOfArray) {
			System.out.println(element);

		}

		Iterator wordsIterator = wordsOfArray.iterator();
		while (wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
		

	}

}
