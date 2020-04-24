package Task5;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class SquaEqu {

	private int a;
	private int b;
	private int c;

	public SquaEqu(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void calculation(){
		double d = new Discriminant().disc();
		if (d>0) {
			double k1 = (b * (-1) + sqrt(d)) / (2 * a);
			double k2 = (b * (-1) - sqrt(d)) / (2 * a);
			System.out.println("X1=" + k1);
			System.out.println("X2=" + k2);
		}
		if (d==0) {
			double k = (b * (-1) ) / (2 * a);
			System.out.println("X=" + k);
		}
		if (d<0) {
			System.out.println("Уравнение не имеет корней");
		}
	}


	class Discriminant{

		private double disc(){
			return (pow(b,2)-4*a*c);
		}
	}
}
