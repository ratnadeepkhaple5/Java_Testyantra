package javaPracticeClass;

public class Pattern2345 {

	public static void main(String[] args) {
		int num=2;
		for (int i = 1; i <=3; i++) {
			
			for (int j = 1; j <=i+1; j++) {
				
				System.out.print(" "+num+" ");
				num++;
			}
			System.out.println();
		}
		
	}
}
