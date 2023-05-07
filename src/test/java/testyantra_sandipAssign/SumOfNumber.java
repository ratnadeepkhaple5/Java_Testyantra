package testyantra_sandipAssign;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123;
		
		int ans=0;
		int count=0;
		
		while (num>0) {
			
			int rem=num%10;
			ans=ans+rem;
			num=num/10;
		
			count++;
		}
		System.out.println(ans);
		System.out.println(count);
	}

}
