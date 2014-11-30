
import java.util.Scanner;
import java.util.Random;

public class DreamCat {
	public static String[] hotCat;
	public static String[][] cats;
	public static boolean win = false;
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		CatsInfo catsInfo = new CatsInfo();
		Cat kitty = new Cat();
		
		cats = new String[5][7]; //24 dudes in dream phone
		catsInfo.populateCatsArray(cats);
		
		for(int i = 0; i < cats.length; i++){
			for (int j = 0; j < cats[0].length; j++){
				System.out.print(cats[i][j] + " ");
			}
			System.out.print("\r");
		}
		
		System.out.println("\r");
		hotCat = cats[rand.nextInt(cats.length)];
		System.out.println("The hottie is " + hotCat[0]);
		//System.out.println("His number is " + hotCat[5]);
		
		String catNumber = "";
		String callOrGuess;
		
		
		do {
			System.out.println("Would you like to call someone or guess who the hottie is? (c/g) ");
			callOrGuess = input.next();
			if (callOrGuess.equals("c")){
				
				System.out.println("Enter the phone number of the cat you would like to call: ");
				catNumber = input.next();
				//whoAreWeCalling(catNumber);
				kitty.call(whoAreWeCalling(catNumber));
				
			} else if (callOrGuess.equals("g")){
				
				System.out.println("Enter the phone number of the cat you would like to guess: ");
				catNumber = input.next();
				kitty.guess(catNumber);
				
			} else {
				System.out.println("Please enter either c or g");
			}

			
						
		} while (win == false);
		
		

		
		
	}
	
	 public static int whoAreWeCalling(String number){
		 for(int i = 0; i < DreamCat.cats.length; i ++){
			 if(DreamCat.cats[i][5].equals(number)){
				 return(i);
			 }
		 }
		 System.out.println("Invalid phone number");
		 return(1200);
	 }
	
}
