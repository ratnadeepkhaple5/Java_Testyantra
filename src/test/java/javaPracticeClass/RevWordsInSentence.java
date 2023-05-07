package javaPracticeClass;

public class RevWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome to tyss";
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			String word=str[i];
			String rev="";
			for (int j = 0; j < word.length(); j++) {
				char ch=word.charAt(j);
				
				rev=ch+rev;
			}
			System.out.print(rev+" ");
		}
		
	}

}
