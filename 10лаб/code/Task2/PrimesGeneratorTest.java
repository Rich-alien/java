package Task2;

public class PrimesGeneratorTest {

	public void soutArrayNormal(Integer[] array){

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public void soutArrayReverse(Integer[] array){

		ComparatorPriGener comparatorPriGener = new ComparatorPriGener();
		Integer[] arrayRev = comparatorPriGener.reversed(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(arrayRev[i]+", ");
		}
	}

}
