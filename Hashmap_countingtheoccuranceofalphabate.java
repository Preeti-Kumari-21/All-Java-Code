package Map;

import java.util.HashMap;

public class Hashmap_countingtheoccuranceofalphabate {

	public static void main(String[] args) {
		
		String x = "PREEEEEEEEEEEEETI";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char y[] = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		while(i != size)
		{
			if(map.containsKey(y[i]) == false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval = map.get(y[i]);
				//System.out.println(oldval);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			
			i++;
		}
		System.out.println(map);

	}

}
