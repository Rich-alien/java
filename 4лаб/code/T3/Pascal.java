package Task3;

public final class Pascal {

	public int[][] matrix(int n) {

		int[][] array = new int[n][n];
		array[0][0] = 1;
		array[1][0] = 1;
		array[1][1] = 1;
		for (int i = 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					array[i][j] = 1;
				} else {
					array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
				}
			}
		}
		return array;
	}
}