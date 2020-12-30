package Core_Java_in28minutes.Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class Set_Example5 {

	public static void main(String[] args) {

		Set<Integer> numbers = Set.of(12, 56, 68, 32, 78, 89, 21, 5, 8, 10);

		TreeSet<Integer> treeSet = new TreeSet<Integer>(numbers);
		System.out.println(treeSet);

		System.out.println(treeSet.floor(12));
		System.out.println(treeSet.ceiling(8));
		System.out.println(treeSet.higher(8));
		System.out.println(treeSet.lower(12));

		System.out.println(treeSet.last());
		System.out.println(treeSet.first());

		System.out.println(treeSet.subSet(8, 32));
		System.out.println(treeSet.subSet(8, true, 32, true));
		System.out.println(treeSet.subSet(8, false, 32, true));
		System.out.println(treeSet.subSet(8, false, 32, false));

		System.out.println(treeSet.headSet(12));
		System.out.println(treeSet.headSet(22));

		System.out.println(treeSet.tailSet(5));
		System.out.println(treeSet.tailSet(89));

	}

}
