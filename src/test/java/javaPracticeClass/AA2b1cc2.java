package javaPracticeClass;

import java.util.Arrays;

public class AA2b1cc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ratnadeep";
		char[] ch = s.toCharArray();
		
		//System.out.println(ch);
		int freqCount=0;
		for (int i = 0; i < ch.length; i++) {
			
			int count=1;
			
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
					
					i++;	//<-------don't forget to updates
					
				} else {
					break;
				}	
			}
			System.out.print(ch[i]+""+count);
			
			if (count>1) {
				freqCount++;
			}
		}
		System.out.println("\n"+s+" "+freqCount);//aabcc 2
	}
	
}
/*
 * String s="aabbcc";
	
	int freqCount=0;
	for (int i = 0; i < s.length(); i++) {
		
		int count=1;
		
		for (int j = i+1; j < s.length(); j++) {
			
			if (s.charAt(i)==s.charAt(j)) {
				count++;
				i++;
			} else {
				break;
			}
			
		}
	//	System.out.print(s.charAt(i)+""+count);
		if (count>1) {
			freqCount++;
		}
	}
	System.out.println(s+" "+freqCount);//aabcc 2
}

  */
	
