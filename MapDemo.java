package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101,"suresh");
		hm.put(102, "kumar");
		hm.put(103, "venkat");
		hm.put(104, "kumar");
		Set s=hm.keySet();
		System.out.println("keys are:"+s);
		Collection c=hm.values();
//		System.out.println("values are:"+c);
		System.out.println(hm.containsKey(103));
//		System.out.println(hm.containsValue("kumar"));
		Set s2=hm.entrySet();
//		System.out.println(s2);
		Iterator i=s2.iterator();
		while(i.hasNext()) {
			//System.out.println(i.next());
			Map.Entry me=(Entry) i.next();  //type casting -iterator to map
			//System.out.println(me.getKey()+" :"+me.getValue());
			if(me.getKey().equals(104)) {
				//System.out.println(me.getValue()); //getting particular key value
				me.setValue("dhashvanth");  //Changing particular key value
				System.out.println(me);
			}
			
		}
	}

}
