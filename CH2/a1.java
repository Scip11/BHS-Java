public class a1 {
	
	
	public static void main(String[] args){	
		SavitchIn savitchIn = new SavitchIn();
		long[] myArray;
		myArray = new long[3];
		long average;
		long total = 0;
		int i = 0;
		
		System.out.println("Type in a number, hit enter, and repeat two times.");
		
		while(i < 3){
			myArray[i] = SavitchIn.readLineLong();
			i++;
		}
		
		i = 0;
		while(i < 3){
			total = (myArray[i] + total);
			i++;
		}
		
		average = total/3;
		System.out.println("The average is: " + average);
	}
}
