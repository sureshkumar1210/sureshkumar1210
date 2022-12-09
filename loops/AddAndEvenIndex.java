package loops;

public class AddAndEvenIndex {

	public static void main(String[] args) {
		String name="suresh";
		int i=0;
		while(i<=name.length()-1) {
			if(i%2==0) {
				System.out.println("Even:"+i);
			}
				else {
					System.out.println("Add:"+i);
				}
			i=i+1;
			
			}
		}

	}
