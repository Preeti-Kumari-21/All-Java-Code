package Core_Java_in28minutes.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example3 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		// Hashset, insertion order is not preserved and value are not sorted.Duplicates
		// not allowed.
		set1.add(400);
		set1.add(600);
		set1.add(300);
		set1.add(400);
		set1.add(500);

		System.out.println(set1);

		Set<Integer> set2 = new LinkedHashSet<Integer>();
		// LinkedHashSet - insertion order is preserved, values are not sorted,
		// duplicates not allowed.
		set2.add(400);
		set2.add(600);
		set2.add(300);
		set2.add(400);
		set2.add(500);

		// System.out.println(set2);

		Set<Integer> set3 = new TreeSet<Integer>();
		// Treeset:- Insertion order not preserved, values are sorted on some sorting
		// algorithm and duplicates are not allowed.
		set3.add(400);
		set3.add(600);
		set3.add(300);
		set3.add(400);
		set3.add(500);

		// System.out.println(set3);


	}

}
