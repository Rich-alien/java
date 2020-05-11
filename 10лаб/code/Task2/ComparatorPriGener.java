package Task2;

public class ComparatorPriGener {

	public Integer[] reversed (Integer[] array) {
		Integer[] arrayReverse = new Integer[array.length];
		int j=0;
		for (int i = (array.length-1); i >= 0; i--) {
			arrayReverse[j]=array[i];
			j++;
		}
		return arrayReverse;
	}
}
