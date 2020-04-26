package Task1;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {

	public void test(String[] args){
		String language;
		String country;

		if (args.length != 2){
			language = new String("en");
			country = new String("US");
		} else{
			language = new String(args[0]);
			country = new String(args[1]);
		}
		Locale currentLocale = new Locale (language, country);

		ResourceBundle messages = ResourceBundle.getBundle("Task1.MessagesBundle", currentLocale);
		System.out.println(messages.getString("greeting"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
	}
}
