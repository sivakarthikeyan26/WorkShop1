package workshop1;

public class gambler {

	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		boolean flag=false;
			while(flag!=true) {
				float win = (float)(Math.random());
				stake -= 1;
				if(win>0.5) {
					stake += (bet*2);
				}
				if(stake == 50 || stake ==150 || stake==25 || stake==13) {
					flag=true;
					System.out.println("The player has retired with "+stake+" for the day");
				}
			}
	}

}
