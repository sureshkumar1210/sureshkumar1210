class index{
    public static void main(String[] args){
        int[] ages={15,16,14,22,35,45};
        int index=-1;
      for(int i=0;i<ages.length;i++){
        if(ages[i]==35){
            index=i;
        }
        
    }
        if(index==-1){
            System.out.println("no");
            }
        else{
            System.out.println(index);
        }
}
}
