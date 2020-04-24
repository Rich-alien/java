package Task3;

public class Arrays<T extends Number> {
	private T array[];

	public Arrays (T array[]) {
		this.array = array;
	}

	public void sort(){
		for (int i = 0; i < array.length; i++) {
			T min = array[i];
			int min_i = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j].floatValue() < min.floatValue()) {
					min = array[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				T tmp = array[i];
				array[i] = array[min_i];
				array[min_i] = tmp;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}