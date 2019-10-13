import java.util.ArrayList;

public class HexMap {
	ArrayList<ArrayList<Hex>> hexes;
	int height;
	int width;
	
	static int CHANCE_FOR_ENCOUNTER=10;
	static int CHANCE_FOR_FEATURE=13;
	static int MAX_NUMBER_OF_ENCOUNTERS=3;
	static int MAX_NUMBER_OF_FEATURES=3;
	
	
	public HexMap(int height, int width) {
		createEmpytHexes(height, width);
		generateTerrain();
		generateEncounters();
		generateFeatures();
	}
	
	public void createEmpytHexes(int height, int width) {
		this.height = height;
		this.width = width;
		hexes = new ArrayList<ArrayList<Hex>>();
		
		for (int i=0; i<height; i++) {
			ArrayList<Hex> row = new ArrayList<Hex>();
			hexes.add(row);
			for (int j=0; j<width; j++) {
				Hex hex = new Hex(i, j);
				hexes.get(i).add(hex);
			}
		}
	}
	
	public void generateTerrain() {
		
	}
	
	public void generateEncounters() {
		for (int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
				Encounter enc = new Encounter();
				
				hexes.get(i).get(j).addEncounter(enc);
			}
		}
	}
	
	public void generateFeatures() {
		
	}
}
