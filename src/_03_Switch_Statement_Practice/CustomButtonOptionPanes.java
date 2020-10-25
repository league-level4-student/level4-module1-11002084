package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("That's the day of the week this program was completed!");
			break;
		case "Monday":
			System.out.println("NOOOOOOOOOOO");
			break;
		case "Tuesday":
			System.out.println("The weekend is so far away");
			break;
		case "Wednesday":
			System.out.println("It's hump day! Woop woop!");
			break;
		case "Thursday":
			System.out.println("It's Friday-Eve");
			break;
		case "Friday":
			System.out.println("IT'S FRIDAY!!");
			break;
		case "Saturday":
			System.out.println("Weekend Homework :(");
			break;
		default:
			System.out.println("Not quite sure how you managed to click a button that's not a day of the week but ok");
		}
	}
}
