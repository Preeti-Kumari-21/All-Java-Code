package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap_to_store_emp_object {

	public static void main(String[] args) {
		
		Employee_to_store_in_hashmap emp1 = new Employee_to_store_in_hashmap (101,"Preeti");
		Employee_to_store_in_hashmap emp2 = new Employee_to_store_in_hashmap (101,"Preeti");
		Employee_to_store_in_hashmap emp3 = new Employee_to_store_in_hashmap (101,"Preeti");
		Employee_to_store_in_hashmap emp4 = new Employee_to_store_in_hashmap (101,"Preeti");
		Employee_to_store_in_hashmap emp5 = new Employee_to_store_in_hashmap (101,"Preeti");
		
		HashMap<Employee_to_store_in_hashmap,String> map = new HashMap<>();
		
		map.put(emp1, "USER1");
		map.put(emp2, "USER2");
		map.put(emp3, "USER3");
		map.put(emp4, "USER4");
		map.put(emp5, "USER5");
		
		
		
		for(Entry<Employee_to_store_in_hashmap, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+ " ---- "+entry.getValue());
		}

	}

}
