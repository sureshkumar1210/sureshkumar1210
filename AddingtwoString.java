package mvi;

public class AddingtwoStringjava {
	
	public static void main(String[] args){
    String word="sureshkumar";
    String word1="venkatesh";
    int len=word.length();
    int len1=word1.length();
    String reverse=" ";
    int i=0;
   while(i<len) {
	   reverse+=word.charAt(i);
	   if(i<len1) {
	   reverse+=word1.charAt(i);
	   }
	   i++;
    }
    System.out.println(reverse);
    }
}
