package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new LinkedHashMap();
		map.put("abc", "A");
		map.put("bcd", "B");
		map.put("cde", "C");
		map.put("def", "D");
		map.put("efg", "E");
		map.put("fgh", "F");
		map.put("ghi", "G");
		
		for(Entry<String, String> entry : map.entrySet() )
		{
			System.out.println("The key is "+entry.getKey()+" the value is "+entry.getValue());
		}
	}

}
