import java.util.ArrayList;

public class Encounter {
	ArrayList<Monster> encounteredMonsters;
	
	//parameters used to generate encounter
	static int MAX_NUMBER_OF_ITEMS = 4;
	static int MAX_NUMBER_OF_MONSTER_TYPES = 4;
	static int MAX_NUMBER_OF_MONSTERS = 30;
	
	public Encounter(ArrayList<Monster> ecounteredMonsters) {
		this.encounteredMonsters = ecounteredMonsters;
	}
	
	public String printEncounteredMonsters() {
		String output = null;
		for (int i=0; i < encounteredMonsters.size(); i++) {
			String monsterType = encounteredMonsters.get(i).getMonsterType();
			output = output + monsterType + " "; 
		}
		return output;
	}
	
	public Encounter() {
		ArrayList<String> monsterTypes = new ArrayList<String>();
		ArrayList<Monster> encounteredMonsters = new ArrayList<Monster>();
		int numOfMonsterTypes = Math.max(DiceRoller.rollD(MAX_NUMBER_OF_MONSTER_TYPES),1);
		int numOfMonsters = DiceRoller.rollD(MAX_NUMBER_OF_MONSTERS);
		
		for (int i = 0; i < numOfMonsterTypes; i++) {
			String monsterType = Monsters.roll();
			monsterTypes.add(monsterType);
		}
		
		for (int i = 0; i < numOfMonsters; i++) {
			System.out.println(numOfMonsterTypes);
			String monsterType = monsterTypes.get(DiceRoller.rollD(numOfMonsterTypes));
			Monster creature = new Monster(monsterType);
			encounteredMonsters.add(creature);
		}
	}
}
