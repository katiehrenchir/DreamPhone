import java.util.Random;

public class CatsInfo {
	
	/*
	 * 0 is location
	 * 1 is sports
	 * 2 is food
	 * 3 is clothes
	 */
	public String[][] populateCluesArray(String[][] array){
		
		array[0][0] = "cineplex theater";
		array[0][1] = "buckley high school";
		array[0][2] = "town park";
		array[0][3] = "galleria mall";
		array[0][4] = "gamer lounge";
		array[0][5] = "pelican beach";
		
		array[1][0] = "baseball";
		array[1][1] = "hockey";
		array[1][2] = "surfing";
		array[1][3] = "soccer";
		array[1][4] = "tennis";
		array[1][5] = "basketball";
		
		array[2][0] = "ice cream";
		array[2][1] = "fruit";
		array[2][2] = "chocolate";
		array[2][3] = "burgers";
		array[2][4] = "fries";
		array[2][5] = "pizza";
		
		array[3][0] = "jeans";
		array[3][1] = "sneakers";
		array[3][2] = "glasses";
		array[3][3] = "a jacket";
		array[3][4] = "a hat";
		array[3][5] = "anything orange";
		
		return(array);
	}
	
	/*
	 * 0 is name
	 * 1 is clothes
	 * 2 is food
	 * 3 is sports
	 * 4 is location
	 * 5 is phone number
	 * 6 is what they give clues about
	 * 7 is a second item of clothing (ugh)
	 * 8 is what they say he never does
	 */
	public String[][] populateCatsArray(String[][] array){
		array[0][0] = "Alex";
		array[0][1] = "a hat";
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
		
		array[5][0] = "Chris";
		array[5][1] = "jeans";
		array[5][2] = "burgers";		
		array[5][4] = "galleria mall";
		array[5][5] = "555-0005";
		
		array[6][0] = "David";
		array[6][1] = "hat";
		array[6][3] = "surfing";
		array[6][4] = "pelican beach";
		array[6][5] = "555-0006";
		
		array[7][0] = "James";
		array[7][1] = "a hat";
		array[7][2] = "pizza";
		array[7][4] = "cineplex theater";
		array[7][5] = "555-0007";
		
		array[8][0] = "Jack";
		array[8][1] = "a hat"; //tbh not super sure about this, the picture is unclear
		array[8][3] = "tennis";
		array[8][4] = "buckley high school";
		array[8][5] = "555-0008";
		
		array[9][0] = "Jason";
		array[9][1] = "glasses";
		array[9][3] = "baseball";
		array[9][4] = "town park";
		array[9][5] = "555-0009";
		
		array[10][0] = "John";
		array[10][1] = "anything orange";
		array[10][2] = "fruit";
		array[10][4] = "gamer lounge";
		array[10][5] = "555-0010";
		
		array[11][0] = "Josh";
		array[11][1] = "glasses";
		array[11][3] = "surfing";
		array[11][4] = "pelican beach";
		array[11][5] = "555-0011";
		
		array[12][0] = "Harry";
		array[12][1] = "a jacket";
		array[12][2] = "ice cream";
		array[12][4] = "galleria mall";
		array[12][5] = "555-0012";
		
		array[13][0] = "Luke";
		array[13][1] = "anything orange";
		array[13][3] = "soccer";
		array[13][4] = "town park";
		array[13][5] = "555-0013";
		
		array[14][0] = "Mark";
		array[14][1] = "jeans";//AND SNEAKERS?? WHAT DO!!?
		array[14][7] = "sneakers";
		array[14][4] = "gamer lounge";
		array[14][5] = "555-0014";
		
		array[15][0] = "Matt";
		array[15][1] = "jeans";
		array[15][2] = "chocolate";
		array[15][4] = "cineplex theater";
		array[15][5] = "555-0015";
		
		array[16][0] = "Michael";
		array[16][1] = "anything orange";
		array[16][2] = "ice cream";
		array[16][3] = "basketball";
		array[16][4] = "pelican beach";
		array[16][5] = "555-0016";
		
		array[17][0] = "Nick";
		array[17][1] = "a jacket"; //AND GLASSES. I'M AT A LOSS. 
		array[17][7] = "glasses";
		array[17][3] = "hockey";
		array[17][4] = "buckley high school";
		array[17][5] = "555-0017";
		
		array[18][0] = "Paul";
		array[18][1] = "sneakers";
		array[18][4] = "galleria mall";
		array[18][5] = "555-0018";
		
		array[19][0] = "Patrick";
		array[19][1] = "jeans";
		array[19][3] = "baseball";
		array[19][4] = "buckley high school";
		array[19][5] = "555-0019";
		
		array[20][0] = "Peter";
		array[20][1] = "a jacket";
		array[20][2] = "burgers";
		array[20][4] = "gamer lounge";
		array[20][5] = "555-0020";
		
		array[21][0] = "Tom";
		array[21][3] = "hockey";
		array[21][4] = "town park";
		array[21][5] = "555-0021";
		
		array[22][0] = "Tyler";
		array[22][1] = "sneakers";
		array[22][2] = "fruit";
		array[22][3] = "tennis";
		array[22][4] = "buckley high school";
		array[22][5] = "555-0022";
		
		array[23][0] = "Will";
		array[23][1] = "a jacket";
		array[23][2] = "popcorn";
		array[23][4] = "cineplex theater";
		array[23][5] = "555-0023";
		
		
		return(array);
	}
	
	public void clueRandomizer(String[][] array){
		Random rand = new Random();
		
		int locationCount = 0;
		int sportsCount = 0;
		int foodCount = 0;
		int clothesCount = 0;
		int noClueCount = 0;
		
		for (int i = 0; i < array.length; i++) {
			while (array[i][6] == null) {
				int number = rand.nextInt(5);
				if (number == 0) {
					if (locationCount < 5) {
						locationCount++;
						array[i][6] = "location";
						
						do {
							array[i][8] = DreamCat.clues[0][rand.nextInt(6)];
						} while (array[i][8].equals(DreamCat.hotCat[4]) || clueIsUsed(i) );				

					}
					
				} else if (number == 1) {
					if (sportsCount < 5) {
						sportsCount++;
						array[i][6] = "sports";
						
						do {
							array[i][8] = DreamCat.clues[1][rand.nextInt(6)];
						} while (array[i][8].equals(DreamCat.hotCat[3]) || clueIsUsed(i) );				

						

					}
				} else if (number == 2) {
					if (foodCount < 5) {
						foodCount++;
						array[i][6] = "food";
						
						do {
							array[i][8] = DreamCat.clues[2][rand.nextInt(6)];
						} while (array[i][8].equals(DreamCat.hotCat[2]) || clueIsUsed(i) );				
						
					}
				} else if (number == 3) {
					if (clothesCount < 5) {
						clothesCount++;
						array[i][6] = "clothes";
						
						do {
							array[i][8] = DreamCat.clues[3][rand.nextInt(6)];
						} while (array[i][8].equals(DreamCat.hotCat[1]) || clueIsUsed(i) );				


					}
				} else if (number == 4) {
					if (noClueCount < 4) {
						noClueCount++;
						array[i][6] = "no clue";
					}
				}
			}
			
		}

		
	}
	
	public boolean clueIsUsed(int i){
		for(int j = 0; j < i; j++){
			if (DreamCat.cats[j][8] == DreamCat.cats[i][8]){
				return(true);
			} 
		}
		return(false);
	}
	
}