package Task3;

import java.util.*;

public class HumanTest {
	private Set<Human> set = new HashSet<>();
	private Set<Human> linkedHashSet = new LinkedHashSet<>();
	private SortedSet<Human> treeSet = new TreeSet<>();
	private TreeSet<Human> treeSetWithComparator = new TreeSet<>(new HumanComparatorByLName());

	private TreeSet<Human> treeSetWithComparatorAge = new TreeSet<>(new Comparator<Human>() {
		@Override
		public int compare (Human o1, Human o2) {
			return o1.getAge()-o2.getAge();
		}
	});

	public void initialSet(){
		set.add(new Human("Andy", "Wolf", 25));
		set.add(new Human("Ritta", "Skitter", 24));
		set.add(new Human("Petr", "Petrov", 31));
		System.out.println("HashSet");
		System.out.println(set);
	}

	public void initialLinkedHashSet(){
		linkedHashSet.add(new Human("Andy", "Wolf", 25));
		linkedHashSet.add(new Human("Ritta", "Skitter", 24));
		linkedHashSet.add(new Human("Petr", "Petrov", 31));
		System.out.println("LinkedHashSet");
		System.out.println(linkedHashSet);
	}

	public void initialTreeSet(){
		treeSet.add(new Human("Andy", "Wolf", 25));
		treeSet.add(new Human("Ritta", "Skitter", 24));
		treeSet.add(new Human("Petr", "Petrov", 31));
		System.out.println("TreeSet");
		System.out.println(treeSet);
	}

	public void initialTreeSetWithComparator(){
		treeSetWithComparator.add(new Human("Andy", "Wolf", 25));
		treeSetWithComparator.add(new Human("Ritta", "Skitter", 24));
		treeSetWithComparator.add(new Human("Petr", "Petrov", 31));
		System.out.println("TreeSetWithComparator");
		System.out.println(treeSetWithComparator);
	}

	public void initialTreeSetWithComparatorAge(){
		treeSetWithComparatorAge.add(new Human("Andy", "Wolf", 25));
		treeSetWithComparatorAge.add(new Human("Ritta", "Skitter", 24));
		treeSetWithComparatorAge.add(new Human("Petr", "Petrov", 31));
		System.out.println("TreeSetWithComparatorAge");
		System.out.println(treeSetWithComparatorAge);
	}
}
