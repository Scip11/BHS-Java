public class Initials {
	public static void main(String[] args){
		char firstin;
		char lastin;
		/* Making and Object for SavitchIn */
		SavitchIn savitchIn = new SavitchIn();
		System.out.println("What is your first Initial?");
		
		firstin = savitchIn.readLineNonwhiteChar();

		System.out.println("What is your last Initial?");
		
		lastin = savitchIn.readLineNonwhiteChar();

		System.out.println("Hello" + firstin + lastin + "!");
		
	}
}
