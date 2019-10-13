import java.io.IOException;

public class WorldGenerator {
	static HexMap hexMap;
	static int mapHeight = 12;
	static int mapWidth = 16;
	
	public static void main(String args[]) throws IOException {
		prepareRandomTables();
		hexMap = new HexMap(mapHeight, mapWidth);
	}
	
	public static void prepareRandomTables() throws IOException {
		Monsters.loadTableResults("potwory.txt");
		Items.loadTableResults("przedmioty.txt");
		HexFeatures.loadTableResults("wielokrotne.txt");
	}
}
