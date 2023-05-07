package javaPracticeClass;

import java.util.Arrays;

public class RotateOneChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testyantra";
		char[] ch=s.toCharArray();
	
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = 0; j < ch.length; j++) {
				
				if (i==0 && j==ch.length-1) {
					
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	//	System.out.println(Arrays.toString(ch));//[a, e, s, t, y, a, n, t, r, t]
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
