package Core_Java_in28minutes.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Set_Example2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Preeti");

		Student s2 = new Student();
		s2.setId(101);
		s2.setName("Preeti");

		// Set<Student> studentSet1 = Set.of(s1, s2);

		Set<Student> studentSet2 = new HashSet<Student>();
		studentSet2.add(s1);
		studentSet2.add(s2);

		// System.out.println(studentSet1);
		System.out.println(studentSet2);

	}

}

class Student {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
