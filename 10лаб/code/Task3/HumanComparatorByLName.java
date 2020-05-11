package Task3;

import java.util.Comparator;

public class HumanComparatorByLName implements Comparator<Human> {

	@Override
	public int compare (Human o1, Human o2) {
		return o1.getlName().compareToIgnoreCase(o2.getlName());
	}
}
