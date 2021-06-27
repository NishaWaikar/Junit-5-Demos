
public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(1234);
		employee.setEmpName("Ramlal");
		employee.setDesignation("Developer");
		employee.setSalary(60000.00);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
		System.out.println("---------------");
		Employee employee2 = new Employee(2345, "Shamlal", "Developer", 60000.00);
		System.out.println(employee2.getEmpId());
		System.out.println(employee2.getEmpName());
		System.out.println(employee2.getDesignation());
		System.out.println(employee2.getSalary());
		System.out.println("Shamlal is promoted");
		employee2.setDesignation("Sr. Developer");
		System.out.println(employee2.getEmpId());
		System.out.println(employee2.getEmpName());
		System.out.println(employee2.getDesignation());
		System.out.println(employee2.getSalary());
	}
}

/*
 * System -  a class in java.lang package, represents the console
 * println - a method responsible for printing - how to print, accepts the parameter to be printed - what to print, 
 * 			 this method belongs to java.io.PrintStream class
 * out   -   predefined object of java.io.PrintStream class in System class, this is static data member of System class
*/
