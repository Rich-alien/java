package sevr;

class TriangleOfPascal5 extends TriangleOfPascal3{
	TriangleOfPascal5(int n){
		super(n);
	}
	@Override
	public boolean equals(Object anObject){
		if (anObject == null)
			return false;
		if(this == anObject)
			return true;
		if(anObject instanceof TriangleOfPascal5){
			TriangleOfPascal5 triangleAn = (TriangleOfPascal5) anObject;
			if((this.getSize() == triangleAn.getSize())&&(this.getMas().length == triangleAn.getMas().length)){  
				int size = triangleAn.getSize();
				int[][] mas1 = this.getMas();
				int[][] mas2 = triangleAn.getMas();
				for(int i = 0; i < size; i++){  
					for(int j = 0; j <= i; j++){
						if(mas1[i][j] != mas2[i][j])
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
		int[][] mas = this.getMas();
		for(int i = 0; i < this.getSize(); i++)  
			for(int j = 0; j <= i; j++)
				res += mas[i][j];
		res += this.getSize();
		return res;
	}
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		int[][] mas = this.getMas();
		for(int i = 0; i < this.getSize(); i++)  
			for(int j = 0; j <= i; j++){
				if(i != j)
					str.append(mas[i][j]).append(" ");
				else
					str.append(mas[i][j]).append("\n");
			}
		return str.toString();
	}
}