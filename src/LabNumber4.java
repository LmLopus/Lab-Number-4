import java.util.Scanner;

public class LabNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		String answer = "yes";
		while(answer.equalsIgnoreCase("yes"))	{
			System.out.println("Welcome! Please enter an integer");
			int number = scnr.nextInt();
			
			System.out.printf("%-12s %-12s %-10s\n", "Number", "Sqaured", "Cubed");
			System.out.printf("%-12s %-12s %-12s\n", "======", "=======", "=====");
			
			
				for (int i = 1; i <= number; i += 1) {
					int sqaured = (i * i);
					int cubed = (i * i * i);
					System.out.printf("%6d %13d %10d\n", i, sqaured, cubed);
		
			}
		
				System.out.println("Would you like to continue? Yes or No");
				answer = scnr.next();
				
		}
		System.out.println("Goodbye!");
	}

}
