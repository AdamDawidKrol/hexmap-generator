import java.util.ArrayList;

public class Monster {
	static int MAX_NUMBER_OF_ITEMS = 4;
	static int MAX_NUMBER_OF_MUTATIONS = 6;
	static int CHANCE_FOR_ITEM = 25;
	static int CHANCE_FOR_MUTATION = 5;
	String type;
	String name;
	ArrayList <String> mutations;
	ArrayList <String> items;
	
	public Monster() {
	}
	
	public void addItem(String item) {
		items.add(item);
	}
	
	public Monster(String type) {
		this.type = type;
		items = new ArrayList<String>();
		mutations = new ArrayList<String>();
		int numberOfItems = DiceRoller.rollD(MAX_NUMBER_OF_ITEMS)-1;
		for (int i = 0; i < numberOfItems; i++) {
			addItem(Items.roll());
		}
	}
	
	public String getMonsterType() {
		return type;
	}
}
