package javaPracticeClass;

import java.util.Arrays;

public class BinaySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,43,1,65,78,212,56,67,9,80};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int searchnum=212;
		
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		
		Boolean found=false;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (searchnum==arr[mid]) {
				found=true;
			} else if(searchnum>arr[mid]){
				start=mid+1;
			}else {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		if (found==true) {
			System.out.println("element found at "+mid+" index");
						
		}else {
			System.out.println("element not found");
		}
	}

}
