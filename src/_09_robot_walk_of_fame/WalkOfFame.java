
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setSpeed(200);
		rob.setX(-90);
		// 2. Make the robot draw a star shape. Hint: 144.
		rob.penDown(); rob.setPenWidth(30);
		
			
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);
			}
		rob.turn(90);
		rob.move(50);
	for (int f = 0; f < 10; f++) {
		
		
		for (int i = 0; i < 5; i++) {
		rob.move(100);
		rob.turn(144);
		}
		rob.move(100);
	}
		
		// 3. Set the size of the star to 30.
		
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
