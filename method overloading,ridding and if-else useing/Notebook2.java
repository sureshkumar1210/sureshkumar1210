class Notebook2 extends Notebook{
        String P="price";  
    @Override
   final  void LongSizeprice(int x,int y){
        System.out.println(W+"--"+P+":$"+x);
        System.out.println(L+"--"+P+":$"+y); 
    }
    @Override
   final void LongSizeprice(int a,int b,String c){
        System.out.println(c+"\n"+"*************************************"+"\n"+W+":$"+a);
        System.out.println(L+":$"+b);
    }
    final void ShortSizePrice(int c,int d){
        System.out.println(W+":$"+c);
        System.out.println(L+":$"+d);
    }
    String ShortSizePrice(int g,int f,String e){
        return (e+"\n"+"*************************************"+"\n"+W+":$"+g+"\n"+L+":$"+f);
        
   
    }
}





// return (System.out.println(e+"\n"+"*************************************"+"\n"+W+":$"+g);
//        System.out.println(L+":$"+f);)
//   
