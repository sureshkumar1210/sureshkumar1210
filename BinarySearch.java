package arrys.program;

public class BinarySearch {
	 static void binarysearch(int arr[],int firstpage,int lastpage,int key) {
			int midpage=(firstpage+lastpage)/2;
			while(firstpage<=lastpage) {
				if(arr[midpage]<key) {
					firstpage=midpage+1;
				}
				else if(arr[midpage]==key) {
					System.out.println("element is found at inde:"+midpage);
					break;
				}
				else {
					lastpage=midpage-1;
				}
				midpage=(firstpage+lastpage)/2;
			}
			if(firstpage>lastpage) {
				System.out.println("element is not found!");
			}
		}
		public static void main(String[] args) {
			int arr[]= {10,20,30,40,50};
			int key=30;
			int lastpage=arr.length-1;
			binarysearch(arr,0,lastpage,key);
			
			}

		}
