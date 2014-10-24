public class a9 {
	
	public static void main(String[] args){	
		SavitchIn savitchIn = new SavitchIn();
		int price;
		int money = 100;
		int q = 0;
		int n = 0;
		int d = 0;

		System.out.println("Enter price of item /n (from 25 cents to a dollar, in 5-cent increments.");

		price = savitchIn.readInt();

		money = money - price;

		while(money >= 25){
			money = money - 25;
			q++;
		}
		while(money >= 5){
			money = money - 5;
			d++;
		}
		if(money == 5){
			n = 1;
		}

		System.out.println("Your change is \n" + q + " Quarters \n" + d + " Dimes \n" + n + " Nickles \n");

	}
}