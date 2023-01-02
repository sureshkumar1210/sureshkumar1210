package set;

public class Objectex {

	public static void main(String[] args) {
		Objectex ex=new Objectex();
		int hash=ex.hashCode();
		System.out.println("first:"+hash);
		Objectex ex1=ex;
		int hash1=ex1.hashCode();
		System.out.println("second:"+hash1);
		
		String s="s";
		System.out.println("s hash:"+s.hashCode());
		String s1=s;
		System.out.println("s1.hash:"+s1.hashCode());
		Integer i=4;
		Integer il=4;
		boolean ib=i.equals(il);
		System.out.println("Integer equals:"+ib);
	}

}
