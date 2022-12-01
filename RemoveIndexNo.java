package arrys.program;

public class RemoveIndexNo {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		int index=2;
		int size=a.length-1;
		int[] removearray=new int[size];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i!=2) {
					removearray[j]=a[i];
					j++;
					System.out.println(a[i]);
				}
			}
		}
	}


