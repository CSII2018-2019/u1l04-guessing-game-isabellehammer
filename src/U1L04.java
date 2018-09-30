import javax.swing.JOptionPane;

public class U1L04 {
	


		public static void main(String[] args) {
			
			int computerNum = (int)(Math.random() * 100) + 1;
			// should I put it like this? : String answer = JOptionPane.showInputDialog("Guess an integer between 1 and 100: ");
			String input;
			int userNum = -1;
			do {
				input = JOptionPane.showMessageDialog(null, "Please enter a number in between 1 and 100.");
				userNum = Integer.parseInt(input);
			} while (userNum > 100 || userNum < 1);
			
			
			/* things I have to do:
			 * - randomize a computer guess by using int computerNum = (int)(Math.random() * 100) + 1;
			 * - allow user to guess in a loop which is exited by guessing correctly or inputting -1
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
