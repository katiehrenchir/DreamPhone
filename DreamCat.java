
import java.util.Scanner;
import java.util.Random;

public class DreamCat {
	public static String[] hotCat;
	public static String[][] cats;
	public static String[][] clues;
	public static Cat kitty = new Cat();
	public static boolean win = false;
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		CatsInfo catsInfo = new CatsInfo();
		String notHim = "";
		
		
		cats = new String[24][9];
		catsInfo.populateCatsArray(cats);
		clues = new String[4][6];
		catsInfo.populateCluesArray(clues);
		hotCat = cats[rand.nextInt(cats.length)];
		//System.out.println("The hot dude is " + hotCat[0]);
		catsInfo.clueRandomizer(cats);
		
		/*for (int i = 0; i < cats.length; i++) {
			System.out.print(i + " ");
			System.out.print(cats[i][6]);
			System.out.print(" " + cats[i][8]);
			System.out.println("\r");
		}*/
		
		System.out.print("How many players? ");
		int numOfPlayers = input.nextInt();
		String[] players = new String[numOfPlayers];
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.print("Player " + (i + 1) + ": ");
			players[i] = input.next();
		}
		System.out.println("\r");
		do {
			for (int i = 0; i < numOfPlayers; i++) {
				if (win == false) {
					System.out.println(players[i] + "'s turn");
					turn();
				} else {
					break;
				}
			}
				if (win == false) {
				do {
					notHim = cats[rand.nextInt(24)][0];
				} while (notHim.equals(hotCat[0]));
				//this may repeat the same hint mult times
				System.out.println("Here's a hint: it's not " + notHim);
				System.out.println("\r");
			}

		} while (!win);
		
	}
	
	public static void turn(){
		Scanner input = new Scanner(System.in);
		
		String catNumber = "";
		String callOrGuess = "";
		
		System.out.println("Would you like to call someone or guess who the hot dude is? (c/g) ");
		callOrGuess = input.next();
		if (callOrGuess.equals("c")){
			
			System.out.println("Enter the phone number of the cat you would like to call: ");
			catNumber = input.next(); //a try catch around entering the number might be nice...
			kitty.call(whoAreWeCalling(catNumber));
			
		} else if (callOrGuess.equals("g")){
			
			System.out.println("Enter the phone number of the cat you would like to guess: ");
			catNumber = input.next();
			kitty.guess(whoAreWeCalling(catNumber));
			
		} else {
			System.out.println("Please enter either c or g");
		}			
		
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