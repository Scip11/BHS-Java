public class a2{
	SavitchIn savitch = new SavitchIn();
	public static void main(String[] args) {
		String sentence;
		int length;

		System.out.println("Write a sentence plz...");
		sentence = SavitchIn.readLine();
		

		int[] letterArray = new int[26];
		sentence = sentence.trim();
		sentence = sentence.replace(" ", "");
		sentence = sentence.replaceAll("[.,?!1234567890]", "");
		length = sentence.length();

		//System.out.println(sentence);

		char[] sentArray = sentence.toCharArray();
		char letter;
		int value;
		for(int i = 0; i < length; i++){
			value = (int) sentArray[i];
			value = value - 97;
			letterArray[value]++;
		}
		for(int i = 0; i < 26; i++){
			if(letterArray[i] != 0){
				int b = i+97;
				char c = (char)b;
				System.out.println("There are " + letterArray[i] + " " + c +"'s");
			}
			else{

			}
		}
	}
}