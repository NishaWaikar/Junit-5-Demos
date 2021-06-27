import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(list.size() + " : " + list);
		
		// adding element
		list.add(new Integer(20)); // boxing
		list.add(20); // autoboxing
		list.add(30);
		System.out.println(list.size() + " : " + list);
		list.add(40);
		list.add(90);
		System.out.println(list.size() + " : " + list);
		
		//insert
		list.add(1, 100);
		System.out.println(list.size() + " : " + list);
		
		//delete
		//search
		
		//modify
		list.set(1, 200);
		System.out.println(list.size() + " : " + list);
		
		//iterate
		System.out.println("for loop");
		for(int index=0; index<list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		System.out.println("--------------------------------");
		System.out.println("for each loop");
		for (Integer value : list) {
			System.out.println(value);
		}
		
		System.out.println("------------------------");
		System.out.println("iterator interface");
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


























