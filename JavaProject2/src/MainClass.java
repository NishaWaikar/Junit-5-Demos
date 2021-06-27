
public class MainClass {
	public static void main(String[] args) {
		Person person = new Student("Geeta", "Pune", 1, 89, 67, 78);
		person.displayInfo();
		Student student = (Student) person;
		student.calcAvg();
	}
}
