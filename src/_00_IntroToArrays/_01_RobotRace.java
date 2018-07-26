package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		stuff();
	}
		//2. create an array of 5 robots.
	public static void stuff() {
		Robot[] r = new Robot[5];
		//3. use a for loop to initialize the robots.
		int x = 0;
		
		for(int i = 0; i < r.length; i++) {
		x = x + 100;
			r[i] = new Robot(x, 500);
			r[i].setSpeed(50);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		boolean raceFinished = false;
		while(!raceFinished) {
    	for (int j = 0; j < r.length; j++) {
    		int y = new Random().nextInt(50);
			r[j].move(y);
    if(r[j].getY() <= 0) {
    	raceFinished = true;
    	System.out.println("Robot " + j + "is the winner!");
    }
    
    	}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    		
		//7. declare that robot the winner and throw it a party!     ???///|V|V|\\\<< START HERE >>///|V|V|\\\???
    	
		//8. try different races with different amounts of robots.
	}
	    //9. make the robots race around a circular track.

	
}
