package hw4_1;

public class Student {
	private int students;
	private int score;

	public Student() {
		students = 1;
		score = 0;
	}
	public Student(int students, int score) {
		this.students = students;
		this.score = score;
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [학번=" + students + ", 점수=" + score + "]";
	}
}