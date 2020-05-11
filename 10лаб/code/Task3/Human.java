package Task3;

public class Human implements Comparable<Human>{
	private String fName;
	private String lName;
	private Integer age;

	public Human (String fName, String lName, Integer age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public String getfName ( ) {
		return fName;
	}

	public void setfName (String fName) {
		this.fName = fName;
	}

	public String getlName ( ) {
		return lName;
	}

	public void setlName (String lName) {
		this.lName = lName;
	}

	public Integer getAge ( ) {
		return age;
	}

	public void setAge (Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo (Human o) {
		int rez;
		if (this.equals(o)) return 0;
		rez = fName.compareToIgnoreCase(o.getfName());
		if (rez != 0) return rez;
		rez = lName.compareToIgnoreCase(o.getlName());
		if (rez != 0)
			return rez;
		else
			return age - o.getAge();
	}

	@Override
	public String toString ( ) {
		return "Human{" +
				"fName='" + fName + '\'' +
				", lName='" + lName + '\'' +
				", age=" + age +
				'}';
	}
}
