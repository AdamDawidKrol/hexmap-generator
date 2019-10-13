import java.util.Random;

public class DiceRoller {
	public static boolean rollD100Under(int chance) {
		Random rand = new Random();
		int rollResult = rand.nextInt(100);
		if (rollResult < chance) {
			return true;
		}
		else return false;
	}
	
	public static int rollD(int dice) {
		Random rand = new Random();
		int rollResult = rand.nextInt(dice);
		return rollResult;
	}
}
