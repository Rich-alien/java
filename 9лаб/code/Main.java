import Task1.Box;
import Task2.OrderedPair;
import Task2.Pair;
import Task2.Util;
import Task3.Arrays;

public class Main {

	public static void main (String[] args) {
      // task1();
	//	task2();
	task3();
	}

	public static void task1 ( ) {
		Box<Integer> integerBox = new Box<>();
		integerBox.set(10);
		integerBox.inspect(20.2f);
	}

	public static void task2 ( ) {
		Pair<String, String> p1 = new OrderedPair<>("hello", "world");
		Pair<String, String> p2 = new OrderedPair<>("hello", "world");
		boolean same = Util.<String, String>compare(p1, p2);
		System.out.println(same);
	}

	public static void task3 ( ) {
		Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		Double[] doubleArr = {1.2, 2.1, 3.4, 5.6, 1.7, 2.8, 3.9, 0.5};
		Float[] floatArr = {1.2f, 2.1f, 3.4f, 5.6f, 1.7f, 2.8f, 3.9f, 0.5f};

		Arrays<Integer> arraysInteger = new Arrays<>(intArr);
		Arrays<Double> arraysDouble = new Arrays<>(doubleArr);
		Arrays<Float> arraysFloat = new Arrays<>(floatArr);

		arraysInteger.sort();
		arraysDouble.sort();
		arraysFloat.sort();

	}

}

