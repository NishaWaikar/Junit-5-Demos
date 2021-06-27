
public class User {
	private int age;

	public int getAge() {
		return age;
	}

	//called code
	public void setAge(int a) throws AgeException{
		if(a < 18) {
			throw new AgeException("Age cannot be < 18");
		}else
			age = a;
	}
	
	//calling code
	public static void main(String[] args) {
		User user = new User();
		try {
			user.setAge(12);
		} catch (AgeException e) {
			e.printStackTrace();
		}
		System.out.println("Age is : " + user.getAge());
	}	
}