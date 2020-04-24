package Task2;

public class Bird2 implements Animal {
	@Override
	public void hasVoice() {}

	@Override
	public void hasWool(){}

	@Override
	public void hasWings() {
		System.out.println("У меня есть крылья");
	}
}