package testyantra_sandipAssign;

public class SumOfNumberAndCheckBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=811;

		int ans=0;

		while (num>0) {

			int rem=num%10;
			ans=ans+rem;
			num=num/10;

		}
		System.out.println(ans);//10
		
		int ans1=0;
		if (ans>=10 && ans<=99) {
		
			while(ans>0) {
			int add=ans%10;
			ans1=ans1+add;
			ans=ans/10;
		}
		System.out.println(ans1);//1
	 }
	}

}
