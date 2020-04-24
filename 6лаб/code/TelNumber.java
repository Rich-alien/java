package sevr;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class TelNumber{
	private String number;
	public TelNumber(String number){
		this.number = number;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter russian's phone number");
		String str = sc.nextLine();
		TelNumber num = new TelNumber(str);
		num.validNumber();
		System.out.println("Mobile operator : "+num.mobileOperator());
	}
	public boolean validNumber(){
		//+79277789972 -> Винни
		Pattern pattern = Pattern.compile("^((\\+?7)([0-9]{10}))$");
		Matcher matcher = pattern.matcher(number);
		if(matcher.matches()){
			System.out.println("Phone number " + number + " is correct");
			return true;
		}
		else{
			System.out.println("Phone number " + number + " is incorrect");
			return false;
		}
	}
	public String mobileOperator(){
		char num[] = number.toCharArray();
		int value = Character.getNumericValue(num[2]) * 100 +
			Character.getNumericValue(num[3]) * 10 +
			Character.getNumericValue(num[4]);
		int[] Beeline = {903,905,906,909,951,953,960,961,962,963,964,
		965,966,967,968};
		int[] Mts = {910,911,912,913,914,915,916,917,918,919,980,981,
		982,983,984,985,987,988,989};
		int[] Megaphone = {920,921,922,923,924,925,926,927,928,929};
		int[] Tele2 = {900,901,902,904,908,950,951,952,953,958,977,
		991,992,993,994,995,996};
		int Yota = 999;
		boolean check = true;
		String mOperator;
		while(check){
			if(value == Yota){
				mOperator = "Yota";
				return mOperator;
			}
			for(int i = 0;i<Beeline.length;i++)
				if(value == Beeline[i]){
					check = false;
					mOperator = "Beeline";
					return mOperator;
				}
			for(int i = 0;i<Mts.length;i++)
			if(value == Mts[i]){
				check = false;
				mOperator = "Mts";
				return mOperator;
			}
			for(int i = 0;i<Megaphone.length;i++)
			if(value == Megaphone[i]){
				check = false;
				mOperator = "Megaphone";
				return mOperator;
			}
			for(int i = 0;i<Tele2.length;i++)
			if(value == Tele2[i]){
				check = false;
				mOperator = "Tele2";
				return mOperator;
			}
		}
	return "mobileOperator not found";
	}

}