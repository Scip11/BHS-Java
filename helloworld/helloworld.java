public class helloworld {
	char answerletter;
	String namereply;
	public void main(String[] args){
		donow();			
	}

	public void donow(){
		System.out.println("Hello World!");
		
		System.out.println("Do you want to play a game? (y/n)");
		answerletter = System.in.nextLine().charAt(0);
		if(answerletter == 'y'){
			System.out.println("What is your Name?");
			namereply = System.in.nextLine();
		}
		else if(answerletter == 'n'){
			System.out.println("Fine...");
		}
	}
	
	
}

