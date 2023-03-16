package practice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s="race";
		String s1="care";
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		if(s.length()==s1.length()) {
			char[] ar=s.toCharArray();
			char[] ar1=s1.toCharArray();
			Arrays.sort(ar);
			Arrays.sort(ar1);
			boolean result=Arrays.equals(ar,ar1);
			if(result) {
				System.out.println(s +" and "+s1 +"are anagram");
			}
			else {
				System.out.println(s +" and "+s1 +"are not anagram");
			}
			System.out.println(ar);
			System.out.println(ar1);
		}
		else {
			System.out.println(s+" and "+s1+" not anagram");
		}

	}

}
