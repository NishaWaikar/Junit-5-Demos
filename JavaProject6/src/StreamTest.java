import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<Dish> meatDishes = Dish.menu.stream().filter(dish -> (dish.getType().equals("MEAT"))).collect(Collectors.toList());
		
		
	}
}
