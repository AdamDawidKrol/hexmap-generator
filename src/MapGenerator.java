import java.io.IOException;
import java.util.Random;

public class MapGenerator {
	static Monsters monsters;
	static HexFeatures hexFeatures;
	static int monsterChance;
	static int goldChance;
	static int hexFeaturesChance;
	static int abstractChance;
	static int height;
	static int width;
	static public void prepareRandomTables() {
		try {
			monsters = new Monsters("monsters.txt");
			hexFeatures = new HexFeatures("wielokrotne.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//files
	public static void main(String args[]) throws IOException {
		prepareRandomTables();
		System.out.println(monsters.roll());
	}
	
	public static String getOutput() {
		String output="";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width ; j++) {
				
			}
		}
		return output;
	}
	
	public static void setChances() {
		monsterChance =13;
		goldChance=50;
		hexFeaturesChance=13;
		abstractChance=12;
	}
	
	public static void setMapSize() {
		height = 12;
		width = 16;
	}
	
	public static String rollHexContents() {
		String monstersInHex;
		String hexFeaturessInHex;
		boolean hasContent;
		String contents = "";
		
		rollForMonsters();
	//	rollForhexFeaturess();
	

		return contents;
	}
	
	public static String rollForMonsters() {
		
		String monstersRolled = "";
		String monsterType;
		int monsterNumber;
		boolean hasTreasure;
		
		if (DiceRoller.rollD100Under(monsterChance)) {
			monsterType = monsters.roll();
			
			}
		
		return monstersRolled;
	}
	
	public static String rollForTreasure() {
		return "a";
	}
	
	//static 
}
