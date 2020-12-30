package Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_Demo {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<String, String>();
		map.put("A", "Preeti");
		map.put("Z", "Kumari");
		map.put("X", "Arya");
		map.put("B", "Ayushi");
		map.put("CC", "1");
		map.put("D", null);
		map.put("","" );
		
		for(Entry<String, String> entry : map.entrySet())
		{
			System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
		}

	}

}
