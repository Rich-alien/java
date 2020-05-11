import Task2.PrimesGenerator;
import Task2.PrimesGeneratorTest;
import Task3.HumanTest;

import java.util.*;

import static java.util.Collections.frequency;

public class Main {

	public static void main (String[] args) {

   //   task1();
   //     task2();
//     task3();
		task4();
	}

	public static void task1 ( ) {
		Integer[] array = {1, 6, 9, 10, 0, 6, -8, 5, 6, 10, 2, 13, 13, -3, -9, -6, 12, 47, -8, 20};
		Integer[] arrayFin = new Integer[20];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.rotate(list, 1);
		System.out.println(list);
		List<Integer> listUni = new ArrayList<>();
		List<Integer> listPov = new ArrayList<>();
		for (Integer buf : list) {
			if (frequency(list, buf) != 1) {
				listPov.add(buf);
			} else {
				listUni.add(buf);
			}
		}
		System.out.println(listUni);
		System.out.println(listPov);
		list.toArray(arrayFin);
		for (int i = 0; i < arrayFin.length; i++) {
			System.out.print(arrayFin[i] + " ");
		}
	}

	public static void task2 ( ) {
		PrimesGenerator primesGenerator = new PrimesGenerator();
		PrimesGeneratorTest prime = new PrimesGeneratorTest();
		Integer[] array = primesGenerator.generate(100);
		prime.soutArrayNormal(array);
		System.out.println();
		prime.soutArrayReverse(array);
	}

	public static void task3 ( ) {
		HumanTest humanTest = new HumanTest();
		humanTest.initialSet();
		humanTest.initialLinkedHashSet();
		humanTest.initialTreeSet();
		humanTest.initialTreeSetWithComparator();
		humanTest.initialTreeSetWithComparatorAge();
	}

	public static void task4(){
		Set<Character> setDual = new HashSet<>();
		Set<Character> setFirst = new HashSet<>();
		Set<Character> setAll = new HashSet<>();
		List<Character> listDual = new LinkedList<>();
		List<Character> listFirst = new LinkedList<>();
		List<Character> listAll = new LinkedList<>();

		String firstStr = "Поясните иерархию интерфейсов в Java Collection Framework.";
		String secondStr = "Объясните скелетные классы и классы реализации Java Collection Framework.";
		char[] firstStrChar = firstStr.toCharArray();
		char[] secondStrChar = secondStr.toCharArray();

		for (int i = 0; i < firstStrChar.length; i++) {
			int index = secondStr.indexOf(firstStrChar[i]);
			if (index==-1){
				setFirst.add(firstStrChar[i]);
			} else{
				setDual.add(firstStrChar[i]);
			}
			setAll.add(firstStrChar[i]);
		}
		for (int i = 0; i < secondStrChar.length; i++) {
			setAll.add(secondStrChar[i]);
		}

		System.out.println("Обычный порядок");
		System.out.println(setDual);
		System.out.println(setFirst);
		System.out.println(setAll);
		System.out.println("Обратный порядок");
		setDual.forEach(value-> ((LinkedList<Character>) listDual).addLast(value));
		setFirst.forEach(value-> ((LinkedList<Character>) listFirst).addLast(value));
		setAll.forEach(value-> ((LinkedList<Character>) listAll).addLast(value));
		Collections.reverse(listDual);
		Collections.reverse(listFirst);
		Collections.reverse(listAll);
		System.out.println(listDual);
		System.out.println(listFirst);
		System.out.println(listAll);
		System.out.println("В порядке возрастания циклического сдвига влево на n разрядов хеш-функции символа.");

		foo(listDual);
		foo(listFirst);
		foo(listAll);
	}


	 public static void foo(List<Character> list){
		List<Integer> listInt = new LinkedList<>();
		 for (int i = 0; i < list.size(); i++) {
			 listInt.add(Integer.valueOf(shl(((Integer)list.get(i).hashCode()).toString())));
		 }

		 for (int i = 0; i < listInt.size()-1; i++) {
			 int j=i+1;
			 if (listInt.get(i) > listInt.get(j)) {
				 Integer buf = listInt.get(i);
				 listInt.remove(i);
				 ((LinkedList<Integer>) listInt).addLast(buf);

				 Character bufChar = list.get(i);
				 list.remove(i);
				 ((LinkedList<Character>) list).addLast(bufChar);
				 i=-1;
			 }
		 }
		 System.out.println(listInt);
		 System.out.println(list);
		 System.out.println();
	 }

	public static String shl(String s) {
		Integer n = 2;

		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < n; i++) {
			sb.append(sb.charAt(0));
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}