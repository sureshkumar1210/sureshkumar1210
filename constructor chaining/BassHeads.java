class BassHeads extends BoatHeadSets{
        String type="wired";
        int warrenty=2;
    public BassHeads(){
        super();
        System.out.println("child cons"+warrenty);
    }
    public static void main(String[] args){
        
        BassHeads bh=new BassHeads();
        bh.price=500;
        bh.Color="red";
        System.out.println(bh.price);
    }
}
            
