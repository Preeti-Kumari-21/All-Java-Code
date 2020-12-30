package Core_Java_in28minutes.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example4 {

	public static void main(String[] args) {

		List<Character> characters = List.of('A', 'Z', 'B', 'A', 'Z', 'F', 'a', 'z');

		Set<Character> set_characters_hashset = new HashSet<Character>(characters);
		// unique characters but insertion order is not preserverd. Not sorted in
		// alphabatical order.
		System.out.println(set_characters_hashset); // OP - [A, a, B, F, Z, z] , OP will change

		Set<Character> set_characters_LinkedHashSet = new LinkedHashSet<Character>(characters);
		// Preserves the insertion order + duplicate not allowed in Linked HashSet.
		System.out.println(set_characters_LinkedHashSet); // OP- [A, Z, B, F, a, z]

		Set<Character> set_characters_Treeset = new TreeSet<Character>(characters);
		// Sorts character in ascending order and based upon ascii value. Duplicates not
		// allowed.
		System.out.println(set_characters_Treeset);// [A, B, F, Z, a, z]

	}

}
