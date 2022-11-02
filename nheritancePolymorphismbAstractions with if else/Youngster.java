package suresh.kumar;

public class Youngster extends Teenage {
	protected Youngster(String name,String relation,int age) {
		super("venkatesh","brother",21);
		this.name=name;
		this.relation=relation;
		this.age=age;
		System.out.println("Name:"+name+"  "+"GF:"+relation+"  "+"age"+age);
		
	}
	protected Youngster() {
		super("venkatesh","brother",21);
		
	}
    static void about(Childhood C) {
    	C.age();
    	C.school();
    	C.collage();
    }

	public static void main(String[] args) {
		Youngster sk=new Youngster();
		sk.name="sureshkumar";
		sk.age=25;
		if(sk.name.equals("sureshkumar")){
			System.out.println("About SK");
			about(sk);
			if(sk.age==28) {
				System.out.println("Sk Relationship status");
				Youngster suresh=new Youngster("Arthipriya","Lover",24);
				
			}else {
				sk.Hoppie("GYM");
			}	
		}
			}

	}
