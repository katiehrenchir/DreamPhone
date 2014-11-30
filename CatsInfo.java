import java.util.Random;

public class CatsInfo {
	
	/*
	 * 0 is name
	 * 1 is clothes
	 * 2 is food
	 * 3 is sports
	 * 4 is location
	 * 5 is phone number
	 * 6 is what they give clues about??
	 */
	public String[][] populateCatsArray(String[][] array){
		array[0][0] = "Alex";
		array[0][1] = "hat";
		//array[0][2] = "";
		array[0][3] = "basketball";
		array[0][4] = "pelican beach";
		array[0][5] = "555-0000";
		
		array[1][0] = "Adam";
		array[1][1] = "Black";
		array[1][2] = "pizza";
		array[1][4] = "galleria mall";
		array[1][5] = "555-0001";
		
		array[2][0] = "Anthony";
		array[2][1] = "anything orange";
		array[2][2] = "chocolate";
		array[2][4] = "cineplex theater";
		array[2][5] = "555-0002";
		
		array[3][0] = "Brandon";
		array[3][1] = "glasses";
		array[3][4] = "gamer lounge";
		array[3][5] = "555-0003";
		
		array[4][0] = "Ben";
		array[4][1] = "sneakers";
		array[4][2] = "popcorn";
		array[4][3] = "soccer";
		array[4][4] = "town park";
		array[4][5] = "555-0004";
		
		for(int i = 0; i < array.length; i++){
			array[i][6] = clueRandomizer();
		}
		
		return(array);
	}
	
	public String clueRandomizer(){
		Random rand = new Random();
		
		int number = rand.nextInt(4);
		System.out.println(number);
		
		if (number == 0){
			return("location");
		} else if (number == 1){
			return("sports");
		} else if (number == 2){
			return("food");
		} else if (number == 3){
			return("clothes");
		} else {
			return("error");
		}
		
	}

}
