
public class Employee {
	//instance variables
	//represents state of an object
	private int empId;
	private String empName;
	private String designation;
	private double salary;
	
	public Employee() {
		System.out.println("Employee Constructor");
		empId = 2345;
		empName = "Sham";
		designation = "Tester";
		salary = 50000.00;
	}
	
	public Employee(int empId, String empName, String designation, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
