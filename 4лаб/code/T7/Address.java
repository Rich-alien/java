package Task7;

public class Address {

	private String town;
	private String street;

	public void setDirection(String direction, String street) {

		this.town = direction;
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	@Override
	public String toString(){
		return "" + town + ", " + street;
	}
}
