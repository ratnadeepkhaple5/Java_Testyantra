package testyantra_sandipAssign;

import java.util.Arrays;

public class SeparateNumFromStrAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="a11b22c33";

		String sp="";
		for (int i = 0; i < word.length(); i++) {

			if (!Character.isLetter(word.charAt(i))) {
				sp=sp+word.charAt(i);
			}
		}
		//	System.out.println(sp);

		int num=Integer.parseInt(sp);
		System.out.println(num);//112233
		int ans=0;
		while (num>0) {
			int rem=num%10;
			ans=ans+rem;
			num=num/10;
		}
		System.out.println(ans);
	}

}
