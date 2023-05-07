package javaPracticeClass;

import java.util.Arrays;

public class SortBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {32,34,63,12,65,78};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {  //> greater for ascending
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
