// version 2.0

/*
	z = x + i * y;						алгебраическая форма
	z = r * (cos(f) + i * sin(f));		тригонометрическая форма
		r = sqrt(x * x + y * y);		модуль комплексного числа
		f = arctg(y / x);				аргумент комплексного числа
	z = r * e ^ (i * f);				показательная форма
	z = x + i * y, q = a + i * b; 		необходимые данные
*/
package sevr;
import java.util.Scanner;
import static java.lang.Math.atan;
class Compl{
	private double real;
	private double imag;
	public Compl(){
		this.real = 0.0;
		this.imag = 0.0;
	} 
	public Compl(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	public double getReal(){
		return real;
	}
	public double getImag(){
		return imag;
	}
	public void setReal(double real){
		this.real = real;
	}
	public void setImag(double imag){
		this.imag = imag;
	}
	public void showAlForm(){
		System.out.println("algebraic form");
		System.out.println("z = " + this.real + " + i * " + this.imag);
	}
	public void showTrigForm(){
		System.out.println("trigonometric form");
		System.out.println("z = " + 
			Math.sqrt(this.real * this.real + this.imag * this.imag) + 
			" * " + "(cos(" + atan(this.imag / this.real) + 
			") + i * sin(" + atan(this.imag / this.real) + "))");
	}
	public void summation(Compl anObj){//+
		this.real += anObj.getReal();
		this.imag += anObj.getImag();
	}
	public void substraction(Compl anObj){// -
		this.real -= anObj.getReal();
		this.imag = -1 * (this.imag +
			anObj.getImag());
	}
	public void multiplication(Compl anObj){// *
		this.real = this.real * anObj.getReal() - this.imag * anObj.getImag();
		this.imag = -1 * (this.real * anObj.getImag() + this.imag * anObj.getReal());
	}
	public void division(Compl anObj){// /
		this.real = (this.real*anObj.getReal() + this.imag*anObj.getImag()) / (anObj.getReal()*anObj.getReal()+ anObj.getImag()*anObj.getImag());
		this.imag = (this.imag*anObj.getReal() - this.real*anObj.getImag()) / (anObj.getReal()*anObj.getReal() + anObj.getImag()*anObj.getImag());
	}
}