package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class StringLengthCompare {

	public static void main(String[] args) {
		StrignLengthOrder ascendingLength=new StrignLengthOrder();
		TreeSet<String> names=new TreeSet<String>(ascendingLength);
		names.add("akash");
		names.add("suresh");
		names.add("karthii");
		names.add("hari");
		System.out.println(names);
		String s1="hari";
		String s2="akash";
		System.out.println("compare to:"+s1.compareTo(s2));
		StringReverseComp ascendingString=new StringReverseComp();
		ArrayList<String> name=new ArrayList<String>();
		name.add("suresh");
		name.add("kumar");
		name.add("karthi");
		Collections.sort(name,ascendingString);
		System.out.println(name);
		
	}

}
