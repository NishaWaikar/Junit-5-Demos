
public class Student extends Person{
	private int rollNo;
	private int std;
	public Student(int rollNo, int std, String name, int age, Address address) {
		super(name, age, address);
		System.out.println("Student Constructor");
		this.rollNo = rollNo;
		this.std = std;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", std=" + std + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
