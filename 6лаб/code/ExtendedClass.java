package sevr;
import java.util.Scanner;
class ExtendedClass{
	private final byte b;
	private final int i;
	private final double d;
	private final String s;
	public ExtendedClass(){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter string");
		this.s = input.nextLine();
		System.out.println("Enter value for type byte");
		this.b = (byte) input.nextInt();
		System.out.println("Enter value for type int");
		this.i = input.nextInt();
		System.out.println("Enter value for type double");
		this.d = input.nextDouble();
		System.out.println();
	}
	public ExtendedClass(byte b, int i, double d, String s){
		this.s = s;
		this.b = b;
		this.i = i;
		this.d = d;
	}
	public static void main(String args[]){	// main
		ExtendedClass firstOb  = new ExtendedClass();
		ExtendedClass secondOb = new ExtendedClass();
		System.out.println(firstOb);
		System.out.println(secondOb);
		if( firstOb.equals(secondOb) )
			System.out.println("==");
		else
			System.out.println("!=");
	}
	@Override
	public boolean equals(Object anObject){	// equals
		// проверка строк
		if (anObject == null)
			return false;
		if(this == anObject)
			return true;
		// остальные проверки
		if( anObject instanceof ExtendedClass){
			ExtendedClass ec = (ExtendedClass) anObject; // это трафарет
			// проверка строк
			String anStr = ec.getS();
			int j = this.s.length();
			if(this.s.length() == anStr.length()){
				char v1[] = this.s.toCharArray();
				char v2[] = anStr.toCharArray();
				while(j-- != 0){
					if(v1[j] != v2[j]){
						return false;
					}
				}
			}
			else 
				return false;// не совпала длина строк
			// проверка остальных полей
			if( (this.b == ec.getB() ) && 
				(this.i == ec.getI() ) &&
				(Double.compare(this.d,ec.getD() ) == 0) 
				)
					return true;
		}
		return false;
	}
	@Override
	public int hashCode(){					// hashCode
		//int prime = 31;
		int res = 17;
		long temp;
		temp = Double.doubleToLongBits(d);
		res += (int)(temp ^ (temp >>> 32));	// d
		res += i;							// i
		res += b;							// b
		return res;
	}
	@Override
	public String toString(){				// toString	
		return (b + "\n"+ i +"\n"+ d +"\n"+ s +"\n");
	}
	//геттеры
	public byte getB(){
		return this.b;
	}
	public int getI(){
		return this.i;
	}
	public double getD(){
		return this.d;
	}
	public String getS(){
		return this.s;
	}
}