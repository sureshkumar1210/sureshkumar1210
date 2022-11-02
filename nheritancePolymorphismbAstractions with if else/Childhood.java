package suresh.kumar;

abstract class Childhood {
    int age;
    String name;
	String relation;
	abstract void age();
	abstract void school();
	abstract void collage();
	public Childhood(String appa,String amma) {
		this.name=appa;
		this.relation=amma;
		System.out.println("parents");
		System.out.println("name:"+appa+amma);
	}
	

}
