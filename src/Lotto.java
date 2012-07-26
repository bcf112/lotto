import java.util.Random;

public class Lotto {

	/**
	 * @param args
	 *            인스턴스 변수
	 * 
	 */
	Random random = new Random();

	public static void main(String[] args) {
		new Lotto().printLotto();
	}

	public void printLotto() {
		for (int i = 0; i < 6; i++) {
			System.out.println(getNumber(random));
		}
	}

	private int getNumber(Random random) {
		return random.nextInt(45) + 1;
	}

}
