
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String ans = JOptionPane.showInputDialog("Which birthday would you want to be reminded about?");
		// 3. Print out what the user typed
		System.out.println(ans);
		// 4. if user asked for "mom"
		if(ans.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(ans.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if(ans.equalsIgnoreCase("Kyle")) {
			System.out.println(myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else{
			System.out.println("Sorry, I don't remember that person's birthday.");
		}
	} 
}
