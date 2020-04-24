package Task3;

import java.util.Random;

public class Player implements  Interface{
	private Random random = new Random();
	private int countWin=0;
	private int sum;

	@Override
	public int flip(){
		return random.nextInt(6)+1;
	}

	@Override
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
