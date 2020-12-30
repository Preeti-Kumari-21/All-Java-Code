// This doesn't work, Queue will not follow any order

package Core_Java_in28minutes.Collections.Queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class selfComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return -Integer.compare(value1.length(), value2.length());
	}

}
public class Queue_Example2 {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>(new selfComparator());
		queue.addAll(List.of("a", "abcdefg", "ab", "abc", "abcd", "abcdefgh", "abcde", "abcdef"));

		// a,ab,abc,abcd,abcde,abcdef,abcdefg,abcdefgh

		System.out.println(queue);

	}

}
