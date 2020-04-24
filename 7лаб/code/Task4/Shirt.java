package Task4;

public class Shirt {
	private String id;
	private String discription;
	private String color;
	private String size;

	public Shirt (String id, String discription, String color, String size) {
		this.id = id;
		this.discription = discription;
		this.color = color;
		this.size = size;
	}

	public Shirt ( ) {
	}

	public Shirt parseShirt(String string){
		String[] array = string.split(",");
		id=array[0].trim();
		discription=array[1].trim();
		color=array[2].trim();
		size=array[3].trim();
		return new Shirt(id, discription, color, size);
	}

	@Override
	public String toString ( ) {
		return "Shirt{" +
				"id='" + id + '\'' +
				", discription='" + discription + '\'' +
				", color='" + color + '\'' +
				", size='" + size + '\'' +
				'}';
	}
}
