package javaPracticeClass;

public class SwapStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a*#b*%_z*c#";

		int left=0;
		int right=s.length()-1;

		for (int i = 0; i < s.length(); i++) {
								//length
			char chl=s.charAt(left);
			char chr=s.charAt(right);
			
			if (s.charAt(left)>='a' && s.charAt(left)<='z') {
				//compare char present or not
				if (s.charAt(right)>='a' && s.charAt(right)<='z') {

					if (left<right) {
						char temp = chl;
						chl=chr;
						chr=temp;

						chl++;
						chr--;
						
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
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}

	}

}
