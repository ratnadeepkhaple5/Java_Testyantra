package javaPracticeClass;

public class CountCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="RaTnaDeeP";
		
		String cap="";
		int capCount=0;
		for (int i = 0; i <s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				
				cap=cap+s.charAt(i);
				capCount++;
			}
		}
		System.out.println(cap+"="+capCount);
	}

}
