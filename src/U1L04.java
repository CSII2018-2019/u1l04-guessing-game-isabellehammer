import javax.swing.JOptionPane;

public class U1L04 {
	


		public static void main(String[] args) {
			
			
			String input;
			int userNum = -1;
			
			do {
				input = JOptionPane.showInputDialog(null, "Guess a number.");
						userNum = Integer.parseInt(input);
			} while (userNum > 100 || userNum < 0);
			
			System.out.println("guess a number: ");
		}

}
