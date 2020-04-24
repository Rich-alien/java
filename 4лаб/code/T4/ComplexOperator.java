package Task4;

import static java.lang.Math.pow;

public class ComplexOperator {

	private ComplexNum first;
	private ComplexNum second;

	public ComplexOperator(ComplexNum first, ComplexNum second) {
		this.first = first;
		this.second = second;
	}

	public String plus() {

		int resultReal = first.getReal() + second.getReal();
		int resultImag = first.getImag() + second.getImag();
		return "Сумма комплесных чисел = " + resultReal + "x+" + resultImag + "i";
	}

	public String minus() {

		int resultReal = first.getReal() + second.getReal();
		int resultImag = first.getImag() + second.getImag();
		return "Разность комплесных чисел = " + resultReal + "x-" + resultImag + "i";
	}

	public String increase() {

		int resultReal = first.getReal() * second.getReal() - first.getImag() * second.getImag();
		int resultImag = first.getReal() * second.getImag() + first.getImag() * second.getReal();
		return "Произведение комплесных чисел = " + resultReal + "x+" + resultImag + "i";
	}

	public String division() {

		double resultReal = (first.getReal() * second.getReal() + first.getImag() * second.getImag()) / (pow(second.getReal(), 2) + (pow(second.getImag(), 2)));
		double resultImag = (first.getImag() * second.getReal() - first.getReal() * second.getImag()) / (pow(second.getReal(), 2) + (pow(second.getImag(), 2)));
		return String.format("Деление комплесных чисел = %.3fx + %.3fi", resultReal, resultImag);
	}
}