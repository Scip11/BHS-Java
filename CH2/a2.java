public class a2 {
	public static void main(String[] args){	
		SavitchIn savitchIn = new SavitchIn();
		long number;
		String convNumber;
		int i = 0;
		
		System.out.println("Print a 4 digit number... Please...");
		number = savitchIn.readLineLong();
		convNumber = ""+ number;
		
		while(i < 4){
			System.out.println(convNumber.charAt(i));
			i++;
		}
	}
}
