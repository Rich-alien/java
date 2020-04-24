package Task8;

import static java.lang.Math.cos;
import static java.lang.Math.cbrt;

public class Calculator {

	 public void cosinus(int intStart, int intEnd, int step){
		 System.out.println();
		 for (int i = intStart; i < intEnd; i+=step) {
			 System.out.println("" + cos(i));
		 }
	 }

	 public void koren(int intStart, int intEnd, int step){
		 System.out.println();
		 for (int i = intStart; i < intEnd; i+=step) {
			 System.out.println("" + cbrt(i));
		 }
	 }
}