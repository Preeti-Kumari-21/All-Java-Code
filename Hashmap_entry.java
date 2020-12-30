package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap_entry {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Emp1", "CSE");
		map.put("null", "BSE");
		map.put("Emp3", "DSE");
		map.put("null", "cbcbsdbcdhsbchdsbchdbhdv");
		map.put("Emp4", "ESE");
		map.put("Emp5", "FSE");
		map.put("Emp6", "GSE");
		map.put("Emp7", "HSE");
		map.put("Emp8", "ISE");
		map.put("Emp9", "JSE");
		map.put("Emp10", "KSE");
		map.put("Emp11", "LSE");
		
		
		for(Entry<String, String> entry : map.entrySet())
		{
			System.out.println("The key is "+entry.getKey() +" the value is "+entry.getValue());
		}
		
	}
		
		

}
