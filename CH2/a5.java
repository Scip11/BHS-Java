
public class a5 {
	
	public static void main(String[] args){	
		SavitchIn savitchIn = new SavitchIn();
		String word;
		String sentence;
		System.out.println("Write a sentence and then press enter/return.");
		
		word = savitchIn.readWord();
		sentence = savitchIn.readLine();
		

		sentence.replace(word, " ");
		

		sentence = sentence + " " + word;
				
		System.out.println(sentence);
		System.exit(0);
	}
}
