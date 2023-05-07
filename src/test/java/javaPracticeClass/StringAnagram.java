package javaPracticeClass;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="ratnadeeq";
		char[] s1arr=s1.toCharArray();
		
		String s2="deepratna";
		char[] s2arr=s2.toCharArray();
		
		Arrays.sort(s1arr);
		Arrays.sort(s2arr);
		
		System.out.println(s1arr);
		System.out.println(s2arr);
		
		
		System.out.println(Arrays.equals(s1arr, s2arr)+"=Anagram");
	}

}
