package Task2;

public class Person {
	private String surname;
	private String name;
	private String middlename;

	public String getFIO() {
		StringBuilder sb = new StringBuilder();
		if (!name.isEmpty() && !middlename.isEmpty()) {
			sb.append(surname).append(" ").append(name.substring(0,1)).append(".").append(middlename.substring(0,1)).append(".");
			return sb.toString();
		} else if (!name.isEmpty() && middlename.isEmpty()) {
			sb.append(surname).append(" ").append(name.substring(0,1)).append(".");
			return sb.toString();
		} else if (name.isEmpty() && !middlename.isEmpty()) {
			sb.append(surname).append(" ").append(middlename.substring(0,1)).append(".");
			return sb.toString();
		} else {
			return surname;
		}
	}

	public Person (String surname, String name, String middlename) {
		this.surname = surname;
		this.name = name;
		this.middlename = middlename;
	}
}
