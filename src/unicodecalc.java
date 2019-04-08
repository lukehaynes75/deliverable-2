import java.util.Scanner;
public class unicodecalc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstWord;
		String secondWord;
		char word1[];
		char word2[];
		int result1 = 0;
		int result2 = 0;
		int difference = 0;
		Scanner scnr = new Scanner(System.in);
		
		//asking for two words to evaluate
		System.out.println("Please enter two words");
		firstWord = scnr.next();
		secondWord = scnr.next();
		
		//converting first word
		word1 = firstWord.toCharArray();
		for(char letter:word1)
		{
			result1 += (int)letter;
			System.out.printf("%s:%d\n", letter, (int)letter);
		}
		
		//converting second word
		word2 = secondWord.toCharArray();
		for(char letter:word2)
		{
			result2 += (int)letter;
			System.out.printf("%s:%d\n", letter, (int)letter);
		}
		
		if(result1 > result2)
			difference = result1 - result2;
		else
			difference = result2 - result1;
		//finding difference
		System.out.printf("Difference as an absolute value: %d", difference);
	}

}
