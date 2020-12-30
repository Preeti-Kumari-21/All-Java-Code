package Core_Java_in28minutes.Collections.Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_example1 {

	public static void main(String[] args) {
		/*
		 * Queue<String> queue = new PriorityQueue<String>();
		 * System.out.println(queue.offer("Preeti"));
		 * System.out.println(queue.offer("KP"));
		 * System.out.println(queue.offer("Shush"));
		 * System.out.println(queue.offer("Sapna"));
		 * System.out.println(queue.offer("Supriya"));
		 * System.out.println(queue.offer("Archana"));
		 * System.out.println(queue.offer("Prashant")); //
		 * System.out.println(queue.poll()); System.out.println(queue);
		 * System.out.println(queue.poll()); System.out.println(queue);
		 * System.out.println(queue.poll()); System.out.println(queue);
		 * System.out.println(queue.poll()); System.out.println(queue);
		 */

		/*
		 * Queue<Integer> queue_with_numbers = new PriorityQueue<Integer>();
		 * queue_with_numbers.add(100); queue_with_numbers.add(900);
		 * queue_with_numbers.add(400); queue_with_numbers.add(700);
		 * queue_with_numbers.add(200); queue_with_numbers.add(300);
		 * queue_with_numbers.add(800); queue_with_numbers.add(600);
		 * queue_with_numbers.add(500); queue_with_numbers.add(1000);
		 * System.out.println(queue_with_numbers);
		 */

		Queue<Character> small_letters = new PriorityQueue<Character>(
				List.of('a', 'c', 'u', 't', 'g', 'd', 'b', 's', 't', 'a', 'g'));
		System.out.println(small_letters);

		// System.out.println(small_letters.peek());
		
		small_letters.offer('z');
		System.out.println(small_letters);
		
		System.out.println(small_letters.isEmpty());
	}

}
