package suresh.kumar;

public class Teenage extends Childhood {
	String school="jeevan matric HR.SEC school";
	String collage="T.K.G atrs&science collage";
	@Override
	void age(){
		System.out.println("Name:"+name+"age"+age);
	}
	@Override
	void school(){
		System.out.println("School:"+school);	
	}
	@Override
	void collage(){
		System.out.println("Collage:"+collage);
	}
	public Teenage(String name,String relation,int Age) {
		super("periysamy","chithra");	
		System.out.println("name:"+name+"  "+"relation:"+relation+"  "+"age:"+Age);
	}
	public Teenage() {
		super("periyasamy","chithra");
		System.out.println("music");
	}
	void Hoppie(String daily) {
		System.out.println("Daily hoppie:"+daily);
	}
	

}
