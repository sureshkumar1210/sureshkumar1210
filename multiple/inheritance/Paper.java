package multiple.inheritance;

public class Paper implements Printable,Showable {
	
	public void print(){
		System.out.println(PAPER_NAME);
	}
	public void show() {
		System.out.println(SHOW_TIME);
	}

	public static void main(String[] args) {
		Paper suresh=new Paper();
		suresh.print();
		suresh.show();
	}

}
