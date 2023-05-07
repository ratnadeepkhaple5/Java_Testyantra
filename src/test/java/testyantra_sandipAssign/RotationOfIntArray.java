package testyantra_sandipAssign;

public class RotationOfIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		
		int key=2;
		
		rotate(a,key);
	}
	
	public static void rotate(int[] arr,int k) {
		
		while(k >0) {
			
			int temp=arr[0];//temp=1 {arr[0]=1}
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];//it will move values of index to next index
		}
		arr[arr.length-1]=temp;
		
		k--;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}	
	}
	
	
	
}
