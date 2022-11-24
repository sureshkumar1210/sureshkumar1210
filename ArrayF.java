class ArrayFind{
	public static void main(String[] args){
		int[] ages={15,29,36,89,78,67,89,78};
        int n=78;
        int count=0;
    for(int i=0;i<ages.length;i++){
        if(ages[i]==n){
        count++;
        }
    }
    System.out.println(count);
    }
}
