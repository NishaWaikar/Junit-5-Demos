import java.util.List;
import java.util.Arrays;

public class Dish {
	
    private  String name;
    private  boolean vegetarian;
    private  int calories;
    private  String type;

    public Dish(String name, boolean vegetarian, int calories, String type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, "MEAT"),
                           new Dish("beef", false, 700, "MEAT"),
                           new Dish("chicken", false, 400, "MEAT"),
                           new Dish("french fries", true, 530, "OTHER"),
                           new Dish("rice", true, 350, "OTHER"),
                           new Dish("season fruit", true, 120, "OTHER"),
                           new Dish("pizza", true, 550, "OTHER"),
                           new Dish("prawns", false, 400, "FISH"),
                           new Dish("salmon", false, 450, "FISH"));
}

// 1. Print names of all the dishes which are of type MEAT
// 2. Print names of all dishes that are veg
// 3. Get the names of the dishes that are having calories less than 400