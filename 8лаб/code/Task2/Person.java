package Task2;

import java.text.DateFormat;
import java.util.Date;

public class Person {
	private String surname;
	private String name;
	private String middlename;
	private Date dateBirth;

	public String getFIO() {
		if (!name.isEmpty() && !middlename.isEmpty()) {
			return surname + " " + name.substring(0, 1) + "." + middlename.substring(0, 1)+".";
		} else if (!name.isEmpty() && middlename.isEmpty()) {
			return surname + " " + name.substring(0, 1)+".";
		} else if (name.isEmpty() && !middlename.isEmpty()) {
			return surname + " " + middlename.substring(0, 1)+".";
		} else {
			return surname;
		}
	}

	public Person (String surname, String name, String middlename, Date dateBirth) {
		this.surname = surname;
		this.name = name;
		this.middlename = middlename;
		this.dateBirth = dateBirth;
	}

	@Override
	public String toString ( ) {
		String fio = getFIO();
		DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dfMed = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
		return "Person: FIO: "+ fio +'\n'+ "Date Long: "+ dfLong.format(dateBirth)
									+'\n'+ "Date Med: "+ dfMed.format(dateBirth)
									+'\n'+ "Date Short: "+ dfShort.format(dateBirth);
	}
}
