import java.util.Scanner;
import java.util.Random;
public class Cat {
	 public Cat() {
		 
	 }
	
	 public void guess(int callee){
		 //System.out.println("your guess: " + number);
		 //System.out.println("hot dude's number: " + DreamCat.hotCat[5]);
		 System.out.println("Now calling " + DreamCat.cats[callee][0] + "...");
		 if (DreamCat.cats[callee][5].equals(DreamCat.hotCat[5]) ){
			 System.out.println("You won! " + DreamCat.hotCat[0] + " wants to go on a date with you!");
			 DreamCat.win = true;
		 } else {
			 System.out.println("Sorry, " + DreamCat.cats[callee][0] + " is not your secret admirer.");
		 }
		 System.out.println("\r");
	 }
	
	 public void call(int callee){
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Now calling " + DreamCat.cats[callee][0] + "...");
		 
		 if (!DreamCat.cats[callee][6].equals("no clue")) {
			System.out.print(DreamCat.cats[callee][0] + " says, \"");
			if (DreamCat.cats[callee][6].equals("location")) {
				System.out.print("I know where he hangs out!\"");
			} else if (DreamCat.cats[callee][6].equals("sports")) {
				System.out.print("He's alright at most sports.\"");
			} else if (DreamCat.cats[callee][6].equals("food")) {
				System.out.print("He eats a ton of junk.\"");
			} else if (DreamCat.cats[callee][6].equals("clothes")) {
				System.out.print("He's got cool clothes.\"");
			}
			System.out.println("");
			System.out.println("Press enter to view your secret clue");
			input.nextLine();
			
		}
		 secretClue(callee);
		 
	 }
	 
	 public void secretClue(int callee){
		 Random rand = new Random();
		 
		 if (DreamCat.cats[callee][6].equals("location")){
			 System.out.println("He never hangs out at " + DreamCat.cats[callee][8]);
		 } else  if (DreamCat.cats[callee][6].equals("sports")){
			 System.out.println("He never plays " + DreamCat.cats[callee][8]);
		 } else  if (DreamCat.cats[callee][6].equals("food")){
			 System.out.println("He never eats " + DreamCat.cats[callee][8]);
		 } else  if (DreamCat.cats[callee][6].equals("clothes")){
			 System.out.println("He never wears " + DreamCat.cats[callee][8]);
		 } else if (DreamCat.cats[callee][6].equals("no clue")){
			 System.out.println("I'd tell you, but that's way too easy!");
		 }
		 
		 System.out.println("\r");
		 
//		 System.out.println("Press enter to erase the clue from the console.");
//		 input.nextLine();
//		 System.out.println("\b\b\b\b\b\b\b\b"); //use string length method and for loop?
		 //or I guess a bunch of newlines could also hide the clue??
	 }

}