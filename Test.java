package set;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		mobile redmi=new mobile("poco",1000,6);
		mobile samsung=new mobile("s10",10000,4);
		System.out.println(redmi.hashCode()+" "+samsung.hashCode());
		HashSet<mobile> set=new HashSet<mobile>();
		set.add(new mobile("poco",1000,6));
		set.add(new mobile("poco1",12000,6));
		set.add(new mobile("poco2",13000,6));
		set.add(new mobile("poco3",14000,6));
		set.add(new mobile("poco4",15000,6));
		System.out.println(set);
		System.out.println(redmi.getprice());
		redmi.setprice(8000);
		System.out.println(redmi.getprice());
		
	}

}
