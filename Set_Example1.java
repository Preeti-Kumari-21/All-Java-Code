package Core_Java_in28minutes.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Set_Example1 {

	public static void main(String[] args) {

		Set<String> set1 = Set.of("Apple", "Banana", "Mango");
		// System.out.println(set1);

		Set<String> set2 = new HashSet<String>(set1);
		set2.add("Preeti");
		set2.add("KP");

		// System.out.println(set2);

	}

}
