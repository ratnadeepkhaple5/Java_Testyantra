package javaPracticeClass;

import java.util.Arrays;

public class SwapWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="ratnadeepq";
		char[] s1ch=s1.toCharArray();
		String s2="hyderabad";
		char[] s2ch=s2.toCharArray();

		System.out.println(s1ch);
		System.out.println(s2ch);

		int length=s1.length();
		if (s1.length()<s2.length()) {
			length=s2.length();
		}
		for (int i = 0; i < length; i++) {

			try {
				if (Character.isAlphabetic(s1ch[i]) && Character.isAlphabetic(s2ch[i])) {

					char ch=s1ch[i];
					s1ch[i]=s2ch[i];
					s2ch[i]=ch;
				}
			} catch (Exception e) {
				if (s1.length()>s2.length()) {
					System.out.println(s1ch.length-1);
					
				} else {
					System.out.println(s2ch.length-1);
				}
			}
		}
		System.out.println(Arrays.toString(s1ch));
		System.out.println(Arrays.toString(s2ch));
	}
}
