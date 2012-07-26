public class Player {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int[] numbers=lotto.getLotto();
		for(int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}

}
