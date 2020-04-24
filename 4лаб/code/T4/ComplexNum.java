package Task4;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.atan;

public class ComplexNum {

	private int real;
	private int imag;
	private int count;

	public ComplexNum(int real, int imag, int count){
		this.real=real;
		this.imag=imag;
		this.count=count;
	}

	public int getReal() { return real; }
	public int getImag() { return imag; }

	private String modul(){
		return String.format("%.2f", sqrt(pow(real,2)+pow(imag,2)));
	}

	private String argument(){
		return String.format("%.2f", atan(imag/real));
	}

	public String algForm (){
		return "Алгебраическая форма комплесного числа " + count + ": Z=" + real + "x+" + imag + "i";
	}

	public String geoForm (){
		return "Тригинометрическая форма комплесного числа " + count + ": Z=" + modul() + "(cos(" + argument() + ") + isin(" + argument() + "))";
	}
}