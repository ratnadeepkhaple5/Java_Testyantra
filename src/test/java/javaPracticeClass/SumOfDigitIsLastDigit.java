package javaPracticeClass;

public class SumOfDigitIsLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=235;
		
		int last=num%10;//5
		
		num=num/10;
		
		int ans=0;
		
		while (num>0) {
			int rem=num%10;
			ans=ans+rem;
			num=num/10;
		}
		if (ans==last) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}

}
