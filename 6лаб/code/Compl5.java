package sevr;
public class Compl5 extends Compl{
	public Compl5(){
		super();
	}
	public Compl5(double real, double imag){
		super(real,imag);
	}
	@Override
	public boolean equals(Object anObject){
		if (anObject == null)
			return false;
		if(this == anObject)
			return true;
		if( anObject instanceof Compl5){
			Compl5 compl = (Compl5) anObject;
			if ((this.getReal() != compl.getReal()) || (this.getImag() != compl.getImag())) return false;
		}
		else
			return false;
		return true;
	}
	@Override
	public int hashCode(){
		int res = 17;
		long temp = Double.doubleToLongBits(this.getReal());
		res += (int)(temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.getImag());
		res += (int)(temp ^ (temp >>> 32));
		return res;
	}
	@Override
	public String toString(){
		return (this.getReal() + " " + this.getImag() + "\n");
	}
}