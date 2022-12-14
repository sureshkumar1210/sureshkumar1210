package String;

public class Stringconstructor {
	String name;
	int id;
	public Stringconstructor(String name,int i) {
		this.name=name;
		this.id=i;
	}
	public String toString() {
		return (this.name+" "+this.id);
	}

	public static void main(String[] args) {
		Stringconstructor sk=new Stringconstructor("hai",205);
		String i="suresh";
		System.out.println(i);
		System.out.println(sk);

	}

}
