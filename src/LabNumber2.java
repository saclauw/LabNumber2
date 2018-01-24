
/* Steven Clauw LabNumber2
 * 
 * Use conditional statements to automate the decision making process
 * the application will prompt the user to enter an integer between 1 and 100
 * Display the correct response based on the integer range entered
 * Extra - end the program officially,
 * 		 - Ask for username and refer to the user by name
 * 		 - Add validation to gurarantee the user enters a positive integer between 1 and 100
 * 
 * Build Specs
 * 	If/else statement to take different actions depending on input
 * 		if odd, print number and "Odd"
 * 		if even between 2 and 25, print "Even and less than 25"
 * 	`	if even between 26 and 60, print "Even"
 * 		if even and greater than 60, print the number entered and "Even"
 * 		if odd and greater than 60, print the number entered "Odd and over 60"
 * 
 */

import java.util.Scanner;

public class LabNumber2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int userNum = 0; 
		boolean validNum; // boolean validNum used to validate userNum
		String a; // String a used for continue do / while loop

		System.out.println("Please enter your name: ");
		String userName = scan.nextLine();
		do { // do / while loop used for continue (y/n)
			do { // do / while loop used to validate input
				System.out.println(userName + ", enter a number between 1 and 100: ");
				if (scan.hasNextInt()) { // if input is an integer it goes on to next step of validation
					userNum = scan.nextInt();
					validNum = true;
				}
				if ((userNum >= 1) && (userNum <= 100)) { // if input is an int in the parameter of 1 - 100 validation is complete
					validNum = true;
				} else { // if input is not an integer or integer in the parameter this prints
					System.out.print("Not a valid entry. ");
					validNum = false;
					scan.nextLine();
				}
			} while (!(validNum)); // after not a valid entry prints, on same line loops back to ask for input again

			if ((userNum % 2 == 0) && (userNum >= 2) && (userNum < 25)) { // if int even and between 2 and 24
				System.out.println("Even and less than 25");
				a = scan.nextLine(); // ???could not get the application to work correctly without initializing the string after every if statement
			}
			if ((userNum % 2 == 0) && (userNum >= 26) && (userNum <= 60)) { // if int even and between 26 and 60
				System.out.println("Even");
				a = scan.nextLine(); // ???could not get the application to work correctly without initializing the string after every if statement
			}
			if ((userNum % 2 == 0) && (userNum > 60)) { // if int even and above 60
				System.out.println(userNum + " Even");
				a = scan.nextLine(); // ???could not get the application to work correctly without initializing the string after every if statement
			}
			if ((userNum % 2 != 0) && (userNum <60)) { // if int odd and below 60
				System.out.println(userNum + " Odd");
				a = scan.nextLine(); // ???could not get the application to work correctly without initializing the string after every if statement
			}
			if ((userNum % 2 != 0) && (userNum > 60)) { // if int odd and above 60
				System.out.println("Odd and over 60");
				a = scan.nextLine(); // ???could not get the application to work correctly without initializing the string after every if statement
			}
			
			System.out.println("Continue? (y/n): "); //after input analyzed user asked if they would like to continue
			userNum = 0; //userNum reset outside of validated parameter to ensure the user prompted for a new input
			a = scan.nextLine(); 
		} while ((a.equals("y")) || (a.equals("Y"))); //completes while loop and restarts if user input "Y"

		if ((a != "y") || (a != "Y")) { // if user input anything but y, prints goodbye and application over.  FIN
			System.out.println("Goodbye, " + userName + "!");
		}

	}
}
