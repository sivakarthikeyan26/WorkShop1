package workshop1;

public class gambler {

	public static void main(String[] args) {
		/*
		 * Initialization part
		 */
		int stake = 100;
		int bet = 1;
		int day_stake = 100;
		boolean flag = false;
		/*
		 * computing for 20 days and the gambler stops to play if he wins 150$ of stack amount
		 */
		for (int i = 1; i <= 20; i++) {
			flag = false;
			while (flag != true) {
				if (day_stake != 150) {
					/*
					 * random variable to calculating whether the gambler has won or lost a bet
					 */
					float win = (float) (Math.random());
					/*
					 * decrementing the stake amount while placing the bet
					 */
					stake -= 1;
					/*
					 * incrementing the stake amount if the gambler wins
					 */
					if (win > 0.5) {
						stake += (bet * 2);
					}
					if (day_stake == 100 && stake == 50) {
						flag = true;
						day_stake = stake;
						System.out.println("The player has retired with " + stake + "$ for day " + i);
					} else if (day_stake == 50 && stake == 25) {
						flag = true;
						day_stake = stake;
						System.out.println("The player has retired with " + stake + "$ for day " + i);
					} else if (day_stake == 25 && stake == 13) {
						flag = true;
						day_stake = stake;
						System.out.println("The player has retired with " + stake + "$ for day " + i);
					} else if (day_stake == 13 && stake == 25) {
						flag = true;
						day_stake = stake;
						System.out.println("The player has retired with " + stake + "$ for day " + i);
					} else if (day_stake == 25 && stake == 50) {
						flag = true;
						day_stake = stake;
						System.out.println("The player has retired with " + stake + "$ for day " + i);
					} else if (day_stake == 50 && stake == 100) {
						flag = true;
						day_stake = stake;
						System.out.println("The player has retired with " + stake + "$ for day " + i);
					} else if (day_stake == 100 && stake == 150) {
						flag = true;
						day_stake = stake;
						System.out.println("The player has retired with " + stake + "$ for day " + i);
						System.out.println("The gambler gambles no more as he got 150$ as stack money");
					}
				}
				/*
				 * if the stake amount is less than 1 then he stops to play as his stack amount is 0
				 */
				if (stake < 1) {
					System.out.println("The gambler has lost all his money on day " + i);
					break;
				}
			}
			if (stake < 1 || stake == 150) {
				break;

			}
		}
		/*
		 * printing the amount of money won by gambler within 20 days
		 */
		if (stake < 100 && stake > 1) {
			System.out.println("The player has lost " + (100 - stake) + "$ within 20 days");
		} else if (stake > 100) {
			System.out.println("The player has won " + (stake - 100) + "$ within 20 days");
		}
	}
}
