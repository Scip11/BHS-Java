public class a4{
	public static void main(String[] args){
		SavitchIn savitchIn = new SavitchIn();
		BubbleSort bubbleSort = new BubbleSort();
		String temp;
		System.out.println("Enter a bunch of numbers");
		temp = savitchIn.readLine();
		char tempAns;
		do{
			int[] intArray = new int[temp.length()];

			for (int i = 0; i < temp.length(); i++) {
				intArray[i] = Character.digit(temp.charAt(i), 10);
			}

			int[] tempArray = bubbleSort.sort(intArray);
			for (int w = 0; w < tempArray.length; w++){
				System.out.println(tempArray[w]);
			}
			System.out.println("Is it in order now?");
			tempAns = savitchIn.readLineNonwhiteChar();
		}while(tempAns == 'y');
	}
}