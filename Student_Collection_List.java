package Core_Java_in28minutes.Collections.List;

public class Student_Collection_List implements Comparable<Student_Collection_List> {

	private int studentId;
	private String studentName;

	public Student_Collection_List(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student_Collection_List [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	@Override
	public int compareTo(Student_Collection_List that) {

		
		// return Integer.compare(this.studentId, that.studentId);// This will sort in
		// ascending order
		// return -Integer.compare(this.studentId, that.studentId);// This in descending
		// order
		// return Integer.compare(that.studentId, this.studentId);// descending order
		return -Integer.compare(that.studentId, this.studentId);// ascending order
		  
		
	}

}
