package Task2;

public final class Fibonachi {

	public int[] matrix (int n){
		int[] array = new int[n];
		array[0]=0;
		array[1]=1;
		for (int i = 2; i < n; i++) {
			array[i]=array[i-1]+array[i-2];
		}
		return array;
	}

}
