import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomTable {
	static ArrayList<String> table;
	static int size;
	static String name;
	
	public static void loadTableResults(String location) throws IOException {
		BufferedReader inputStream = null;
		size=0;
		table = new ArrayList<String>();
		
		try {
            inputStream = new BufferedReader(new FileReader(location));

            String line;
            while ((line = inputStream.readLine()) != null) {
            	System.out.println(line);
            	table.add(line);
            	size++;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
	}
	
	public RandomTable(String location) throws IOException {
		loadTableResults(location);
		name=location;
	}
	
	static String roll() {
		Random rand = new Random();
		String result= "";
		try{
			result = table.get(rand.nextInt(size));
		}
		catch(NullPointerException e) {
			System.out.println("Table " + name + " is empty.");
		}
		return result;
	}
	
}
