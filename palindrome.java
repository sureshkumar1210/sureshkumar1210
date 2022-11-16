class palindrome{
   static void drome(String word){
            int no=word.length()-1;   //y we put in this statement becoz this statement check the letters and put the numbers for ascii table that why we put in (word.length()) this letters statrs with 01234 but we want 1234 thats why we put in (word.length()).
           String reverse="";
            while(no>=0){
               reverse=reverse+word.charAt(no);
                no=no-1;
                }
            if(word.equals(reverse)){
                    System.out.println("this is palindrome...:"+reverse);
                }
            else{
                    System.out.println("this is not palindrome..:"+reverse);
                }
}
 public static void main(String[] args){
            drome("wow");
}
}
                
