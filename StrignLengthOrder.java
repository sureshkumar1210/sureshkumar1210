package collection;

import java.util.Comparator;

public class StrignLengthOrder implements Comparator<String> {
	@Override
	public int compare(String a1,String a2){
		//System.out.println(a1+" "+a2);
		if(a1.length()==a2.length())
		{
			return 0;
		}
		else if(a1.length()>a2.length())
		{
			return 1;
		}
		else
			return -1;
		
	}
	

}
