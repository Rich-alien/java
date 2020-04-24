package sevr;

class TriangleOfPascal3{
	private int mas[][];
	private int size;
	
	public TriangleOfPascal3(int N){
		size = N;
		int Katet;
		Katet = N;
		mas = new int [Katet][];
		for(int i = 0; i < Katet; i++){
			mas[i] = new int[i + 1];  
			for(int j = 0; j <= i; j++){
				// top or right
				if(i == j){
					mas[i][j] = 1;
				}
				//left
				if(i > 0 && j == 0 ){
					mas[i][j] = mas[i - 1][j];
				}
				// seredina
				if(i > 0 && 0 < j && j < i){
					mas[i][j] = mas[i - 1][j - 1] +
											mas[i - 1][j];
				}
			}
		}	
	}
	public void showTriangle(){
		int Katet = size;
		for(int i = 0; i < Katet; i++){ 
			for(int j = 0; j <= i; j++){
				// top or right
				if(i == j){
					System.out.println(mas[i][j]);
				}
				//left
				if(i > 0 && j == 0 ){
					System.out.print(mas[i][j] + " ");
				}
				// seredina
				if(i > 0 && 0 < j && j < i){
					System.out.print(mas[i][j] + " ");
				}
			}
		}
	}
	public int[][] getMas(){
		return mas.clone();
	}
	public int getSize(){
		return size;
	}
}