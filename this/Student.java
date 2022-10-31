class School{
    int rollno;
    String name;
    float fee;
School(int rollno,String name,float fee){
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
    }
void display(){
    System.out.println("Rollno:"+rollno+"\n"+"Name:"+"\n"+"Fee:"+fee);
    }
}
class Student{
    public static void main(String args[]){
    School s1=new School(48,"suresh",10000);
    School s2=new School(98,"sk",17500);
    s1.display();
    s2.display();
    }
}
