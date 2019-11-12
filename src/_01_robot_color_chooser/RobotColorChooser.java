//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
public static void main(String[] args) {
		//1. Create a new Robot
		Robot Rob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 5; i++) {
		String red = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (red.equalsIgnoreCase("red")) {
			Rob.setPenColor(Color.red);	
		}
		else if (red.equalsIgnoreCase("blue")) {
			Rob.setPenColor(Color.blue);
		}
		else if (red.equalsIgnoreCase("green")) {
			Rob.setPenColor(Color.green);
		}
		else if (red.equalsIgnoreCase("yellow")) {
			Rob.setPenColor(Color.yellow);
		}
		else if (red.equalsIgnoreCase("black")) {
			Rob.setPenColor(Color.black);
		}
		else if (red.equalsIgnoreCase("pink")) {
			Rob.setPenColor(Color.pink);
		}
		else Rob.setRandomPenColor();
        //6. If the user doesn’t enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		Rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Rob.setSpeed(200);
		Rob.penDown();
		for (int b = 0; b < 4; b++) {
		Rob.move(100);
		Rob.turn(90);	
		}
	

	}
}
}