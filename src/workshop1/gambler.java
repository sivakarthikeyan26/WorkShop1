package workshop1;

public class gambler {

	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		int day_count=20;
		boolean flag=false;
		for (int i=1; i<=20; i++) {
			flag=false;
			while(flag!=true) {
				float win = (float)(Math.random());
				day_count+=1;
				stake -= 1;
				if(win>0.5) {
					stake += (bet*2);
				}
				if(stake == 50 || stake ==150 || stake==25 || stake==13) {
					flag=true;
					System.out.println("The player has retired with "+stake+" for day "+i);
				}
			}
			if(stake<1) {
				System.out.println("The gambler has lost all his money");
				break;
			}
			
		}
		if(stake<100) {
			System.out.println("The player has lost "+(100-stake)+" in 20 days");
		}
		else {
			System.out.println("The player has won "+(stake-100)+" in 20 days");
		}
	}

}
