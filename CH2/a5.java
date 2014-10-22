public class a5 {
	public static void main(String[] args){	
		SavitchIn savitchIn = new SavitchIn();
		String sentence;
		String newSentence;
		long sentenceLength;
		long i;

		System.out.println("Write a sentence and then press enter/return.");
		sentence = savitchIn.readLine();

		System.out.println("	You entered:");
		System.out.println("	" + sentence);

		sentence = sentence.trim();
		
		String[] sentenceArray = sentence.split(" ");
		
		i = sentenceArray[].lenght();

		newSentence = sentenceArray[i] + " ";
		i = 0;
		while(i < i-1){
			newSentence = newSentence + sentenceArray[i];
			i++;
		}

		System.out.println(sentence);

	}
}
