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
			if(stake == 50 || stake ==150) {
				flag=true;	
			}
		}
		System.out.println("The gambler has retired for the day with "+stake+" stake");
	}

}
