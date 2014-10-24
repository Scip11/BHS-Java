public class a1 {
	
	public static void main(String[] args){	
		SavitchIn savitchIn = new SavitchIn();
		int sentenceLength;
		char sentenceEnd;
		char ans;

		

		do {
			String sentence = "";
			System.out.println("Please write a question.");
			sentence = savitchIn.readLine();
			sentenceLength = sentence.length();

			if((sentenceLength % 2) == 0 && sentence.endsWith("?")){
				System.out.println("Yes");
			}
			else if(sentence.endsWith("?")){
				System.out.println("No");
			}
			else if(sentence.endsWith("!")){
				System.out.println("Wow");
			}
			else{
				System.out.println("You always say " + "\"" + sentence + "\"");
			}

			System.out.println("Would you like to do this again? (y/n)");
			ans = savitchIn.readChar();
			System.out.println("OK.");
		} while(ans == 'y');
	}
}