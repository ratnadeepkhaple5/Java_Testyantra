package javaPracticeClass;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a*#b*%_z*c#";

		char[] ch = s.toCharArray();
		
		int left=0;
		int right=s.length()-1;

		for (int i = 0; i < ch.length; i++) {

			if (ch[left]>='a' && ch[left]<='z') {
				//compare char present or not
				if (ch[right]>='a' && ch[right]<='z') {

					if (left<right) {
						char temp = ch[left];
						ch[left]=ch[right];
						ch[right]=temp;

						left++;
						right--;

					}
				}
				else {
					right--;
				}
			}
			else {
				left++;
			}	
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
