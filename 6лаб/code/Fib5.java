package sevr;
//import java.five.classes.sevr.Fib3;
class Fib5 extends Fib3{
	Fib5(int N){
		super(N);
	}
	@Override
	public boolean equals(Object anObject){
		if (anObject == null)
			return false;
		if(this == anObject)
			return true;
		if( anObject instanceof Fib5){
			Fib5 fib = (Fib5) anObject; // трафарет
			int[] masF = this.getFib3();
			int[] masAn = fib.getFib3();
			int j = masF.length;
			if(masF.length == masAn.length){
				while(j-- != 0){
					if(masF[j] != masAn[j]){
						return false;
					}
				}
			}
			else
				return false;
		}
		else
			return false;
		return true;
	}
	@Override
	public int hashCode(){
		int res = 0;
		int[] masF = this.getFib3();
		for(int i : masF) res += masF[i];
		return res;
	}
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		int[] mas = this.getFib3();
		for(int i = 0; i < mas.length; i++){
			str.append(mas[i]).append(" ");
		}
		return str.toString();
	}
}