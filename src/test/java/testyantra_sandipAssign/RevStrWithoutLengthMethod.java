package testyantra_sandipAssign;

import java.util.ArrayList;
import java.util.Arrays;

public class RevStrWithoutLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		String name="sunny";

		int count=0;
//	
		count=1+name.lastIndexOf('y');//5
		
		System.out.println(count);
		
		for (int i = count-1; i >= 0; i--) {
			
			System.out.print(name.charAt(i));//ynnus
		}
	}

}
