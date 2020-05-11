package Task2;

import java.math.BigInteger;

public class PrimesGenerator {

	private Integer[] array;

	public Integer[] generate (Integer n) {
		array = new Integer[n];
		array[0] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = array[i - 1]+1; j < 10000; j++) {
				BigInteger bigInteger = BigInteger.valueOf(j);
				if (bigInteger.isProbablePrime((int) Math.log(j))) {
					array[i] = j;
					break;
				}
			}
		}
		return array;
	}
}
