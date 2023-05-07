package javaPracticeClass;

import java.util.Iterator;

public class CountOfCharInString {

	public static void main(String[] args) {
		
		 String s="eeweeeegdfdsse";
			
		 char[] ch=s.toCharArray();
		 
			
			for (char c='a';c<='z';c++) {
				int count=0;	
			for (int i = 0; i < ch.length; i++) {
				
				if (c==ch[i]) {
					count++;
				}
			}
			if (count>0) {
				System.out.print(c+""+count);//d2e7f1g1s2w1
			}
			}
		}
}


