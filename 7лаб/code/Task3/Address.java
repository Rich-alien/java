package Task3;

import java.util.StringTokenizer;

public class Address {
	private String country;
	private String region;
	private String city;
	private String street;
	private String house;
	private String corpus;
	private String flate;

	public void getAddressWithComa(String address){
		String[] array;
		array = address.split(",");
		country=array[0].trim();
		region=array[1].trim();
		city=array[2].trim();
		street=array[3].trim();
		house= array[4].trim();
		corpus=array[5].trim();
		flate=array[6].trim();
		System.out.println(toString());
	}

	public void getAddressWithSeparator(String address){
		StringTokenizer st = new StringTokenizer(address, ",.;-");
		country=st.nextToken().trim();
		region=st.nextToken().trim();
		city=st.nextToken().trim();
		street=st.nextToken().trim();
		house=st.nextToken().trim();
		corpus=st.nextToken().trim();
		flate=st.nextToken().trim();
		System.out.println(toString());

	}

	public String toString (){
		return "Страна: " + country +'\n'+
				"Регион: " + region +'\n'+
				"Город: " + city +'\n'+
				"Улица: " + street +'\n'+
				"Дом: " + house +'\n'+
				"Корпус: " + corpus +'\n'+
				"Квартира: " + flate;
	}
}