package javaPracticeClass;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,40,50,60};

		int left=0;
		int right=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			
			if (left<right) {	//< less than to reverse
				int num=arr[left];
				arr[left]=arr[right];
				arr[right]=num;

				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
