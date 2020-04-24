package sevr;

class Fib3{
	private int mas[];
	
	Fib3(int N){
		int lengthFib = N;
		mas = new int [lengthFib];
		for(int i = 0; i < lengthFib; i++){
			if(i == 0){
				mas[i] = 0;
			}
			if(i == 1 || i == 2){
				mas[i] = 1;
			}
			if(i >= 3){ 
				mas[i] = mas[i - 1] + mas[i - 2];
			}
		}
	}
	
	public void showFib3(){
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
	}

	public int[] getFib3(){
		return mas.clone();
	}
}