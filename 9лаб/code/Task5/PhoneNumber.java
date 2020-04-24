package Task5;

public class PhoneNumber {
	private String number;

	public PhoneNumber (String number) {
		this.number = number;
	}
	public String foo(){
		char first = number.charAt(0);
		if (first=='+' && number.length()==12){
			return number.substring(0,5)+'-'+number.substring(5,8)+'-'+number.substring(8);
		} else if (first=='+' && number.length()==13){
			return number.substring(0,6)+'-'+number.substring(6,9)+'-'+number.substring(9);
		} else if (first!='+'&& number.length()==11){
			Integer chislo = (Integer.parseInt(number.substring(0,1))-1);
			return "+" + chislo + number.substring(1,4)+'-'+number.substring(4,7)+'-'+number.substring(7);
		} else if (first!='+'&& number.length()==12){
			Integer chislo = (Integer.parseInt(number.substring(0,2))-1);
			return "+" + chislo + number.substring(2,5)+'-'+number.substring(5,8)+'-'+number.substring(8);
		}
		return null;
	}
}
