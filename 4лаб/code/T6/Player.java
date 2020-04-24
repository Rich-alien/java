package Task6;

import java.util.Random;

public class Player {
	private Random random = new Random();
	private int countWin=0;
	private int sum;

	private int flip(){
		return random.nextInt(6)+1;
	}

	public void flipSameTimes(int kolDice){
		sum=0;
		for (int i = 0; i < kolDice; i++) {
			sum+=flip();
		}
	}

	public int getSum() {
		return sum;
	}

	public int getCountWin() {
		return countWin;
	}

	public void setCountWin(int countWin) {
		this.countWin += countWin;
	}
}
