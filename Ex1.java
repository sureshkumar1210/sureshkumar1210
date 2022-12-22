package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList(); 
		ar.add(1);
		ar.add("suresh");
		ar.add(12.1);
		ar.add(10);
		int length=ar.size();
		System.out.println("length is:"+length);
		System.out.println(ar);
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i));
//		}
		ar.remove(2);
		System.out.println(ar);
		System.out.println("sublist:"+ar.subList(0, 2));
		ArrayList ar1=new ArrayList();
//		for(int i=0;i<ar.size();i++) {
//			ar1.add(ar.get(i));
//		}
		ar1.addAll(ar);
//		ar1.addAll(ar.subList(0,1));
		System.out.println("ar1:"+ar1);
		ar1.add("ragul");
		System.out.println("ar1:"+ar1);
		ar.removeAll(ar);
		System.out.println(ar);
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		Collections.sort(arr);
		System.out.println("sorting the arr:"+arr);
		Collections.shuffle(arr);
		System.out.println("shuffle the arr:"+arr);
		Collections.reverse(arr);
		System.out.println("reverse arr:"+arr);
		Collections.swap(arr,0,4);
		System.out.println("swap the arr:"+arr);
//		Collections.fill(arr,10);
//		System.out.println("fill the arr:"+arr);
//		System.out.println(arr);
		int pos=Collections.binarySearch(arr, 0);
		System.out.println("possition of arr:"+pos);
		for(Integer obj:arr) {
			System.out.println(obj);
		}
		HashSet<Integer> hs=new HashSet<Integer>(ar);
		hs.add(1);
		hs.add(1);
		System.out.println("hs:"+hs);
		
		
		ArrayList<Integer> sk=new ArrayList<Integer>(arr);
		System.out.println("copy the arr values:"+sk);
		sk.add(2);
		sk.add(3);
		System.out.println("adding two values:"+sk);
		int count=Collections.frequency(sk,2);
		System.out.println(count);
		boolean value=Collections.disjoint(arr, ar);
		System.out.println(value);
		int min=Collections.min(sk);
		System.out.println("min value of sk:"+min);
		int max=Collections.max(sk);
		System.out.println("max value of sk:"+max);
		
		
	}

}
