import java.util.*;

public class ThirdAssignment {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner myKeyboard = new Scanner(System.in);

		char key;
		int option = -1;

		do {
			System.out.println();
			System.out.println("What question would you like? ");
			System.out.println("     1 - Q1");
			System.out.println("     2 - Q2");
			System.out.println("     0 - Quit");
			System.out.print("Enter your choice (Question 1 or 2; 0 to exit): ");

			key = myKeyboard.next().trim().charAt(0);
			try {
				option = Integer.parseInt(key + "");
			} catch(Exception e) {
				option = -1;
			}

			while (option < 0 || option > 2) {
				System.out.println("Invalid input!");
				System.out.print("Enter your choice (Question 1 or 2; 0 - exit)? ");
				key = myKeyboard.next().trim().charAt(0);
				try {
					option = Integer.parseInt(key + "");
				} catch(Exception e) {
					option = -1;
				}
			}

			if (option == 0) {
				break;
			}

			System.out.println();
			System.out.println();
			
			switch (option) {
				case 1: {
					// Question 1
					firstQuestion();
					break;
				}
				case 2: {
					//Question 2
					secondQuestion();
					break;
				}
			}

			System.out.println();
			System.out.println();

		} while (true);

		System.out.println("Done.");

	}

	public static void firstQuestion() {
		System.out.println("|----------------->>>><<<<<--------------------|");
		System.out.println("|     Welcome to the Simplified Dart Game!     |");
		System.out.println("|----------------->>>><<<<<--------------------|");
		System.out.println();
		System.out.println("Region   Hits   Points");
		System.out.println("------------------------");

		int[] pointvalues, hits; 
		pointvalues = new int[10];
		hits = new int[10];
		Random r = new Random();
		int low = 1;
		int high = 11;
		int region;

		for(int totalscore = 0; totalscore < 1000; )
		{
			region = r.nextInt(high-low) + low;	
			hits[region - 1] += 1;
			if(region == 1)
				pointvalues[region - 1] += 7;
			else if (region == 2 || region== 3 || region == 4)
				pointvalues[region - 1] += 5;
			else if (region == 5 || region== 6 || region == 7)
				pointvalues[region - 1] += 3;
			else if (region == 8 || region== 9 || region == 10)
				pointvalues[region - 1] += 1;
			totalscore = pointvalues[0] + pointvalues[1]+ pointvalues[2] + pointvalues[3] + pointvalues[4] + pointvalues[5] + pointvalues[6] + pointvalues[7] + pointvalues[8] + pointvalues[9];
		}
		int totalscore = pointvalues[0] + pointvalues[1]+ pointvalues[2] + pointvalues[3] + pointvalues[4] + pointvalues[5] + pointvalues[6] + pointvalues[7] + pointvalues[8] + pointvalues[9];
		int totalhits = hits[0] + hits[1]+ hits[2] + hits[3] + hits[4] + hits[5] + hits[6] + hits[7] + hits[8] + hits[9];

		System.out.println("1        " + hits[0] + "     " + pointvalues[0]	);
		System.out.println("2        " + hits[1] + "     " + pointvalues[1]	);
		System.out.println("3        " + hits[2] + "     " + pointvalues[2]	);
		System.out.println("4        " + hits[3] + "     " + pointvalues[3]	);
		System.out.println("5        " + hits[4] + "     " + pointvalues[4]	);
		System.out.println("6        " + hits[5] + "     " + pointvalues[5]	);
		System.out.println("7        " + hits[6] + "     " + pointvalues[6]	);
		System.out.println("8        " + hits[7] + "     " + pointvalues[7]	);
		System.out.println("9        " + hits[8] + "     " + pointvalues[8]	);
		System.out.println("10       " + hits[9] + "     " + pointvalues[9]	);
		System.out.println();
		System.out.println("It took " + totalhits + " tosses for a total of " + totalscore);
		System.out.println();
		System.out.println("This was an effortless game of darts! ");
	}

	public static void secondQuestion() {
		@SuppressWarnings("resource")
		Scanner myKeyboard = new Scanner(System.in);
		
		System.out.println();
		System.out.println("|----------------------->>>><<<<<--------------------------|");
		System.out.println("|     Welcome to the Decorated Square Drwaing Program!     |");
		System.out.println("|----------------------->>>><<<<<--------------------------|");

		char key;
		String keyString;
		int option = 0;
		
		do {
			System.out.println("\nWhat type of square would you like? ");
			System.out.println("     1 - Full Square");
			System.out.println("     2 - Hollow Square");
			System.out.println("     3 - An X");
			System.out.println("     4 - Horizontal Bars");
			System.out.println("     5 - Vertical Bars");
			System.out.println("     6 - Diagonal Bars");
			System.out.println("     7 - Integer Filled Square");
			System.out.println("     8 - Checkered (must be a multiple of 4)");
			System.out.println("     9 - Quit");
			System.out.print("Enter your choice (1 to 9): ");

			key = myKeyboard.next().trim().charAt(0);
			try {
				option = Integer.parseInt(key + "");
			} catch(Exception e) {
				option = 0;
			}

			while (option < 1 || option > 9) {
				System.out.println("Invalid input!");
				System.out.print("Enter your choice (1 to 9)? ");
				key = myKeyboard.next().trim().charAt(0);
				try {
					option = Integer.parseInt(key + "");
				} catch(Exception e) {
					option = 0;
				}
			}

			if (option == 9) {
				break;
			}

			System.out.println();
			
			int columns;

			if (option == 8) {
				System.out.print("How many rows and columns (max 20 and multiple of 4)? ");

				keyString = myKeyboard.next().trim();
				try {
					columns = Integer.parseInt(keyString);
				} catch(Exception e) {
					columns = 0;
				}
				
				while (columns % 4 != 0 || (columns < 4 || columns > 20)) {
					System.out.println("Invalid input!");
					System.out.print("Enter your choice (max 20 and multiple of 4)? ");
					keyString = myKeyboard.next().trim();
					try {
						columns = Integer.parseInt(keyString);
					} catch(Exception e) {
						columns = 0;
					}
				}
			} else {
				System.out.print("How many rows and colums (min 4 & max 20)? ");
				keyString = myKeyboard.next().trim();
				try {
					columns = Integer.parseInt(keyString);
				} catch(Exception e) {
					columns = 0;
				}

				while (columns < 4 || columns > 20) {
					System.out.println("Invalid input!");
					System.out.print("Enter your choice (min 4 to max 20)? ");
					keyString = myKeyboard.next().trim();
					try {
						columns = Integer.parseInt(keyString);
					} catch(Exception e) {
						columns = 0;
					}
				}
			}

			System.out.println();
			
			// Build pattern
			char[][] patternArr = new char[columns][columns];
			int[][] patternArrInt = new int[columns][columns];
			char fillCharacter;
			boolean hasEven;

			int lastRow = columns - 1;
			int lastColumn = columns - 1;
			
			switch (option) {

				// Full square
				case 1: {
					System.out.print("Which character do you want to fill your square with? ");
					fillCharacter = myKeyboard.next().trim().charAt(0);

					for (int i = 0; i < columns; i++) {
						for (int j = 0; j < columns; j++) {
							patternArr[i][j] = fillCharacter;
						}
					}
			        break;
		        }
				
				// Hollow square
				case 2: {
					System.out.print("Which character do you want for the border? ");
					fillCharacter = myKeyboard.next().trim().charAt(0);

					for (int i = 0; i < columns; i++) {
						for (int j = 0; j < columns; j++) {
							if ((i == 0 || i == lastRow) || (j == 0 || j == lastColumn) ) {
								patternArr[i][j] = fillCharacter;
							} else {
								patternArr[i][j] = ' ';
							}
						}
					}
			        break;					
				}

				// An X
				case 3: {
					System.out.print("Which character do you want for the X? ");
					char charX = myKeyboard.next().trim().charAt(0);

					System.out.print("Which character do you want around for the X? ");
					fillCharacter = myKeyboard.next().trim().charAt(0);
					int k = 0;

					for (int i = 0; i < columns; i++) {
						for (int j = 0; j < columns; j++) {
							if ((i == k || i == lastRow - k) && (j == k || j == lastColumn - k) ) {
								patternArr[i][j] = charX;
							} else {
								patternArr[i][j] = fillCharacter;
							}
						}
						k++;
					}
			        break;
				}

				// Horizontal Bars
				case 4: {
					System.out.print("Which character do you want for the even rows? ");
					char charEven = myKeyboard.next().trim().charAt(0);

					System.out.print("Which character do you want for the odd rows? ");
					fillCharacter = myKeyboard.next().trim().charAt(0);
					
					for (int i = 0; i < columns; i++) {						

						hasEven = (i + 1) % 2 == 0;
						
						for (int j = 0; j < columns; j++) {
							if (hasEven) {
								patternArr[i][j] = charEven;
							} else {
								patternArr[i][j] = fillCharacter;
							}
						}
					}
			        break;
				}

				// Vertical Bars
				case 5: {
					System.out.print("Which character do you want for the even columns? ");
					char charEven = myKeyboard.next().trim().charAt(0);

					System.out.print("Which character do you want for the odd columns? ");
					fillCharacter = myKeyboard.next().trim().charAt(0);

					for (int i = 0; i < columns; i++) {						
						for (int j = 0; j < columns; j++) {
							if ((j + 1) % 2 == 0) {
								patternArr[i][j] = charEven;
							} else {
								patternArr[i][j] = fillCharacter;
							}
						}
					}
			        break;
				}

				// Diagonal Bars
				case 6: {
					System.out.print("Which character do you want for the even diagonals? ");
					char charEven = myKeyboard.next().trim().charAt(0);

					System.out.print("Which character do you want for the odd diagonals? ");
					fillCharacter = myKeyboard.next().trim().charAt(0);

					hasEven = false;
					
					for (int i = 0; i < columns; i++) {						
						hasEven = !hasEven;
						for (int j = 0; j < columns; j++) {
							if (hasEven) {
								patternArr[i][j] = charEven;
							} else {
								patternArr[i][j] = fillCharacter;
							}
							hasEven = !hasEven;
						}
					}
			        break;
				}

				// Integer Filled Square
				case 7: {
					int startingFrom; 

					System.out.print("What is the starting number for your integer filled square (between 0 and 50 inclusive): ");
					keyString = myKeyboard.next().trim();
					try {
						startingFrom = Integer.parseInt(keyString);
					} catch(Exception e) {
						startingFrom = -1;
					}

					while (startingFrom < 0 || startingFrom > 50) {
						System.out.println("Invalid input!");
						System.out.print("Enter your choice (min 0 to max 50)? ");
						keyString = myKeyboard.next().trim();
						try {
							startingFrom = Integer.parseInt(keyString);
						} catch(Exception e) {
							startingFrom = -1;
						}
					}

					// 1 segment
					for (int j = 0; j < columns; j++) {						
						for (int i = j; i < columns; i++) {
							patternArrInt[i][j] = startingFrom;
							startingFrom++;
						}
					}
					// 2 segment
					for (int j = 0; j < columns; j++) {						
						for (int i = j + 1; i < columns; i++) {
							patternArrInt[columns - i - 1][columns - j - 1] = startingFrom;
							startingFrom++;
						}
					}
					break;
				}

				// Checkered (must be a multiple of 4)
				case 8: {
					System.out.print("Which character do you want for the 1st checker? ");
					char firstChecker = myKeyboard.next().trim().charAt(0);

					System.out.print("Which character do you want for the 2nd checker? ");
					char secondChecker = myKeyboard.next().trim().charAt(0);

					for (int i = 0; i < columns; i+=2) {						
						for (int j = 0; j < columns; j+=2) {
							if (j % 4 == 0) {
								patternArr[i][j] = firstChecker;
								patternArr[i][j + 1] = firstChecker;
								patternArr[i + 1][j] = firstChecker;
								patternArr[i + 1][j + 1] = firstChecker;
							} else {
								patternArr[i][j] = secondChecker;
								patternArr[i][j + 1] = secondChecker;
								patternArr[i + 1][j] = secondChecker;
								patternArr[i + 1][j + 1] = secondChecker;
							}
						}

						// Swap checker's characters
						fillCharacter = secondChecker;
						secondChecker = firstChecker;
						firstChecker = fillCharacter; 
					}
					break;
				}
			} // closing of switch

			if (option == 7) {
				printPattern(patternArrInt);
			} else {
				printPattern(patternArr);
			}
		} while (true);
	}
	
	public static void printPattern(char[][] patternArr){
		System.out.println();
		System.out.println("Here is your pattern: ");
		System.out.println();
		for (int i = 0; i < patternArr.length; i++){  
			for (int j = 0; j < patternArr[i].length; j++ ) {
			    System.out.print("    " + patternArr[i][j]);
			}
			System.out.println();
			System.out.println();
		}  
        System.out.println();
	}

	public static void printPattern(int[][] patternArr){
		String value;
		System.out.println();
		System.out.println("Here is your pattern: ");
		System.out.println();
		for (int i = 0; i < patternArr.length; i++){  
			for (int j = 0; j < patternArr[i].length; j++ ) {
				value = String.valueOf(patternArr[i][j]);
			    System.out.print("   " + padl(value, 3));
			}
			System.out.println();
			System.out.println();
		}  
        System.out.println();
	}
	
	private static String padl(String value, int len) {
		if (value == null) {
			value = "";
		}
		return new String(new char[len - value.length()]).replace("\0", " ") + value;
	}

}
