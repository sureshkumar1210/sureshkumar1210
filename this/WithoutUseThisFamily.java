class Fmembers
        {
       String name;
       int age;
public Fmembers(String name,int age)
        {
        name=name;
        age=age;
        System.out.println(name+"  "+"Age"+age);
        }
 void closeperson(){
                System.out.println(name+"  "+"Age"+age);}  
    }

class WithoutUseThisFamily
        {
    public static void main(String args[])
            {
        System.out.println("Sureshkumar Family");
        Fmembers s1=new Fmembers("Dad:periyasamy",55);
        Fmembers s2=new Fmembers("mom:chithra",44);
        Fmembers s3=new Fmembers("brother:venkatesh",22);
        Fmembers s4=new Fmembers("Wife:Arthipriya",24);
        s3.closeperson();
            }
        }   
//output:
//Sureshkumar Family
//Dad:periyasamy  Age55
//mom:chithra  Age44
//brother:venkatesh  Age22
//Wife:Arthipriya  Age24
//null  Age0
     
