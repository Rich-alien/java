package Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	public void test(){
		String strPattern = "exp";
		String strSearching = "It's a regular expression";
		Pattern pattern = Pattern.compile(strPattern);

		Matcher matcher = pattern.matcher(strSearching);

		if (matcher.find()){
			System.out.println("Pattern was found in string!");
		} else {
			System.out.println("Pattern was not found!");
		}
	}
}
