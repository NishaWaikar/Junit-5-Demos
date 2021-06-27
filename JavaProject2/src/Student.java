
public class Student extends Person{
	private int rollNo;
	private int sub1_marks;
	private int sub2_marks;
	private int sub3_marks;
	public Student(String name, String address, int rollNo, int sub1_marks, int sub2_marks, int sub3_marks) {
		super(name, address);
		this.rollNo = rollNo;
		this.sub1_marks = sub1_marks;
		this.sub2_marks = sub2_marks;
		this.sub3_marks = sub3_marks;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Roll NO: "+ rollNo);
		super.displayInfo();
		System.out.println("sub1_marks: " + sub1_marks);
		System.out.println("sub2_marks: " + sub2_marks);
		System.out.println("sub3_marks: " + sub3_marks);
	}
	
	public void calcAvg() {
		double avg = (sub1_marks + sub2_marks + sub3_marks) / 3;
		System.out.println("Avg marks are : " + avg);
	}
}

