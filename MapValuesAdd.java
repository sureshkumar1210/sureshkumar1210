package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapValuesAdd {

	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<String,Integer>();
		mp.put("idly", 25);
		mp.put("dhosai", 50);
		mp.put("vada", 10);
		Set s=mp.entrySet();
		System.out.println(s);
		int result=0;
		for(int value:mp.values()) {
			result+=value;
		}
		System.out.println(result);

	}

}
