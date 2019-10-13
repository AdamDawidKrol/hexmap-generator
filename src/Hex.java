import java.util.ArrayList;

public class Hex {
	int height;
	int width;
	Terrain terrain;
	ArrayList<Encounter> encounters;
	ArrayList<String> features;
	
	
	
	public Hex(int height, int width) {
		this.height = height;
		this.width = width;
		encounters = new ArrayList<Encounter>();
		features = new ArrayList<String>();
	}
	
	public void generateEncounters() {
		
	}
	
	public void generateFeatures() {
		
	}
	
	public void addEncounter(Encounter enc) {
		encounters.add(enc);
	}
	
	public void addFeature(String feature) {
		features.add(feature);
	}
}
