package javaPracticeClass;

public class Pattren4 {

	public static void main(String[] args) {

		int num=1;

		for (int i = 1; i <=4 ; i++) {
			for (int j = 1; j <=i; j++) {

				System.out.print(num);
				num++;
				if (num==10) {
					num=1;
					System.out.print(num);
					num++;
					break;
				}
			}
			System.out.println();
		}
//	System.out.println(num);//2

		while (num<=6) {
			System.out.print(num);
			num++;
		}
	}
}
