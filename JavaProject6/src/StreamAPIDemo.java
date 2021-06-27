import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 34, 23, 45, 56 , 67, 78, 89, 90, 98, 76, 87, 65, 54, 43, 23, 12, 21, 32, 43, 56);
		
		// square each number in the list
		// 1. represent the collection in a stream
		// 2. apply the functionality
		// if the operation needs to be applied to all elements of the collection then use map method

		List<Integer> squareList = numbers.stream().map(number -> number*number).collect(Collectors.toList());
		System.out.println(squareList);
		
		List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		int additionResult = numbers.stream().reduce(0, (ans, i)-> ans + i);
		System.out.println(additionResult);
		
		// find out all even numbers and add them in one result value
		
		int evenNumbersTotal = numbers.stream().filter(number -> number % 2 == 0).reduce(0, (ans, i)-> ans + i);
		System.out.println(evenNumbers);
		
		List<Integer> evenNumbersSorted = numbers.stream().filter(number -> number % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println(evenNumbersSorted);
		
		numbers.stream().sorted().forEach(number -> System.out.println(number));
		
	}
}
