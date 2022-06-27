package workshop1;

public class gambler {

	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		float win = (float)(Math.random());
		stake -= 1;
		if(win>0.5) {
			stake += (bet*2);
		}
		System.out.println(+stake);
	}

}
