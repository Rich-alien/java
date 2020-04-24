package Task7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private Address address;
	private String name;
	private Date dateOfBirth;

	public Person(Address address, String name, String date) {
		this.address = address;
		this.name = name;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		try {
			dateOfBirth = ft.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Address getAddress() { return address; }
	public String getStringAddress() { return address.toString(); }
	public String getName() { return name; }
	public Date getDateOfBirth() { return dateOfBirth; }

	@Override
	public String toString(){
		return "" + address + ", " + name + ", " + dateOfBirth;
	}

}
