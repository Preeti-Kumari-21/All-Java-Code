package Core_Java_in28minutes.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingComparator implements Comparator<Student_Collection_List> {

	@Override
	public int compare(Student_Collection_List student1, Student_Collection_List student2) {
		return -Integer.compare(student1.getStudentId(), student2.getStudentId());
	}

}


class SortByName implements Comparator<Student_Collection_List> {

	@Override
	public int compare(Student_Collection_List o1, Student_Collection_List o2) {
		return -o1.getStudentName().compareTo(o2.getStudentName());
	}

}

public class Student_Collection_List_Main {

	public static void main(String[] args) {

		List<Student_Collection_List> Student_List = List.of(new Student_Collection_List(10, "Preeti"),
				new Student_Collection_List(11, "KP"), new Student_Collection_List(103, "Prashant"),
				new Student_Collection_List(11, "Archana"));

		List<Student_Collection_List> arrayOfStudents = new ArrayList<Student_Collection_List>(Student_List);

		/*
		 * Collections.sort(arrayOfStudents); System.out.println("Default sorting " +
		 * arrayOfStudents);
		 * 
		 * Collections.sort(arrayOfStudents, new DescendingComparator());
		 * System.out.println("DescendingComparator sorting " + arrayOfStudents);
		 * 
		 * arrayOfStudents.sort(new DescendingComparator());
		 * System.out.println("DescendingComparator sorting " + arrayOfStudents);
		 */

		Collections.sort(arrayOfStudents, new SortByName());
		System.out.println(arrayOfStudents);

	}

}
