package javaPracticeClass;

import java.util.HashMap;
import java.util.Set;

public class UniqueCharFromStringHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testyantra";
		char[] ch=s.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (hm.containsKey(ch[i])==false) {
				
				hm.put(ch[i], 1);
			} else {
				int oldvalue=hm.get(ch[i]);
				int newvalue=oldvalue+1;
				hm.put(ch[i], newvalue);
			}
		}
		Set<Character> keys = hm.keySet();
		
		for (Character character : keys) {
			System.out.print(character+" ");//a r s t e y n 
		}
	}

}
