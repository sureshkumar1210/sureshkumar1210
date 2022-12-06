package oops;

public class Sk extends Abstract {
	
	void about(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Work:"+work);
	}
	void hobbies() {
		this.about();
		System.out.println("Hobbiess:music");
	}
	public static void main(String[] args) {
		Sk suresh=new Sk();
		suresh.name="sureshkumar";
		suresh.age=24;
		suresh.work="softwaredeveloper";
		suresh.hobbies();
	}

}
