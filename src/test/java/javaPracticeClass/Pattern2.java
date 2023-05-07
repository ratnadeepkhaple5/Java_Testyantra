package javaPracticeClass;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <=i+1 ; j++) {
				
				System.out.print(" "+num+" ");
			}
			System.out.println();
			num++;
		}
		//System.out.println(num);
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 4; j>= i ; j--) {
				System.out.print(" "+(num-2)+" ");
			}
			System.out.println();
			num--;
		}
	}

}
