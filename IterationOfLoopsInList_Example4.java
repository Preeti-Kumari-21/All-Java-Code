package Core_Java_in28minutes.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationOfLoopsInList_Example4 {

	public static void main(String[] args) {

		List<String> words = List.of("Bat", "KP", "Mat", "Love", "Sat", "Betu", "Cat", "Preeti", "Rat");
		List<String> wordsOfArrayList = new ArrayList<String>(words);

		/*
		 * for (String element : wordsOfArrayList) { if (element.endsWith("at")) {
		 * System.out.println(element); wordsOfArrayList.remove(element); } }
		 */

		/*
		 * System.out.println(wordsOfArrayList); for (int i = 0; i <=
		 * wordsOfArrayList.size() - 1; i++) { if
		 * ((wordsOfArrayList.get(i).endsWith("at"))) {
		 * wordsOfArrayList.remove(wordsOfArrayList.get(i)); } }
		 * System.out.println(wordsOfArrayList);
		 */

		Iterator<String> wordsIterator = wordsOfArrayList.iterator();
		while (wordsIterator.hasNext()) {
			String temp = wordsIterator.next();
			if (temp.endsWith("at")) {
				wordsIterator.remove();
			}

		}
		System.out.println(wordsOfArrayList);


	}

}
