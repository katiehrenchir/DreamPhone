import java.util.Scanner;
public class Cat {
	 public Cat() {
		 
	 }
	
	 public void guess(String number){
		 System.out.println("your guess: " + number);
		 System.out.println("hottie's number: " + DreamCat.hotCat[5]);
		 if (number.equals(DreamCat.hotCat[5]) ){
			 System.out.println("You won! " + DreamCat.hotCat[0] + " wants to go on a date with you!");
			 DreamCat.win = true;
		 } else {
			 System.out.println("Sorry, that's not correct");
		 }
	 }
	 
	 public void call(int callee){
		
		 System.out.println("Now calling " + DreamCat.cats[callee][0] + "...");
		 System.out.println(DreamCat.cats[callee][0] + " knows about " + DreamCat.cats[callee][6]);
		 clue(callee);
		 
	 }
	
	 public void clue(int callee){
		 
		 System.out.print(DreamCat.cats[callee][0] + " says, \"" );
		 if (DreamCat.cats[callee][6].equals("location")){
			 System.out.print("I know where he hangs out!\"");
		 } else  if (DreamCat.cats[callee][6].equals("sports")){
			 System.out.print("He's alright at most sports.\"");
		 } else  if (DreamCat.cats[callee][6].equals("food")){
			 System.out.print("He eats a ton of junk.\"");
		 } else  if (DreamCat.cats[callee][6].equals("clothes")){
			 System.out.print("He's got cool clothes.\"");
		 } else {
			 System.out.print("something messed up");
		 }
		 
		 System.out.println("");
		 System.out.println("Press enter to view your real clue");
		 secretClue(callee);
		 
	 }
	 public void secretClue(int callee){
		 Scanner input = new Scanner(System.in);
		 input.nextLine();
		 System.out.println("clue");
		 
		 System.out.println("Press enter to erase the clue from the console.");
		 input.nextLine();
		 System.out.println("\b\b\b\b\b\b\b\b");
	 }

}
