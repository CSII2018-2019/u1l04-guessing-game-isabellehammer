import javax.swing.JOptionPane;

public class U1L04 {
	


		public static void main(String[] args) {
			
			int computerNum = (int)(Math.random() * 100) + 1;
			String input;
			int userNum = -1;
			int guesses = 0;
			
			// put all below in while loop
			
			while (computerNum != userNum) {
				
				do {
					input = JOptionPane.showInputDialog(null, "Please enter a number in between 1 and 100.");
					userNum = Integer.parseInt(input);
				} while (userNum > 100 || userNum < 1);
				guesses = guesses + 1;
				
				if (userNum > computerNum) {
					System.out.println("Too high! Guess again.");
					
				}
				
				if (userNum < computerNum) {
					System.out.println("Too low! Guess again.");
				}
		
				
				if (userNum == computerNum) {
					System.out.println("That is correct! Your score is " + guesses + " guesses.");
					
				}
				
				if ((computerNum - userNum <= 10) && (computerNum - userNum >= -10)) {
					System.out.println("Your guess is within 10 points of the answer.");
				}
				
			}
				
			
			//put all above in while loop
			
			
			/* things I have to do:
			 * - print a score at the end of how many guesses
			 * - implement a loop to check the user's input so as not to allow input outside the
			 *   1 to 100 range
			 * - output if the user's number is too high, too low, w/i 10 points, or correct
			 * */
			
			// add this stuff back in later: 
			
			/*String input;
			int userNum = -1;
			
			do {
				input = JOptionPane.showInputDialog(null, "Guess a number.");
						userNum = Integer.parseInt(input);
			} while (userNum > 100 || userNum < 0);
			
			System.out.println("guess a number: ");
			*/
		}

}
