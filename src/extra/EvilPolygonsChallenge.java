package extra;
import java.awt.Color;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "What color pentagons would you like?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Green","Red", "Blue","Pink","Purple"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
		rob.setPenColor(Color.GREEN);	
		rob.penDown();
		rob.turn(90);
		for(int i = 0; i<6; i++) {
			rob.move(100);
			rob.turn(60);
			}
		}
		else if(colorChoice == 1) {
		rob.setPenColor(Color.RED);
		rob.penDown();
		rob.turn(90);
		}
		else if(colorChoice == 2) {
		rob.setPenColor(Color.BLUE);
		rob.penDown();
		rob.turn(90);
		}
		else if(colorChoice == 3) {
			rob.setPenColor(Color.PINK);
			rob.penDown();
			rob.turn(90);
			}
		else if(colorChoice == 4) {
			rob.setPenColor(Color.PURPLE);
			rob.penDown();
			rob.turn(90);
			}
		//4. Ask the use how many polygons they want to be drawn.
		String input = JOptionPane.showInputDialog("How many polygons would you like to have drawn? (Preferably less than 8)");
		int inputint = Integer.parseInt(input);
		//5. Use the robot to draw the number of polygons the user requested.
		if(colorChoice == 0) {
			rob.setPenColor(Color.GREEN);	
			rob.penDown();
			for(int x = 0; x<inputint; x++) {
			for(int i = 0; i<6; i++) {
				rob.move(100);
				rob.turn(60);
			}	
			rob.penUp();
			rob.move(210);
			rob.penDown();
			}
			}
			else if(colorChoice == 1) {
			rob.setPenColor(Color.RED);
			rob.penDown();
			for(int x = 0; x<inputint; x++) {
				for(int i = 0; i<6; i++) {
					rob.move(100);
					rob.turn(60);
					
				}	
				rob.penUp();
				rob.move(210);
				rob.penDown();
			}
			}
			else if(colorChoice == 2) {
			rob.setPenColor(Color.BLUE);
			rob.penDown();
			for(int x = 0; x<inputint; x++) {
				for(int i = 0; i<6; i++) {
					rob.move(100);
					rob.turn(60);
					
				}	
				rob.penUp();
				rob.move(210);
				rob.penDown();
			}
			}
			else if(colorChoice == 3) {
				rob.setPenColor(Color.PINK);
				rob.penDown();
				for(int x = 0; x<inputint; x++) {
					for(int i = 0; i<6; i++) {
						rob.move(100);
						rob.turn(60);
						
					}	
					rob.penUp();
					rob.move(210);
					rob.penDown();
				}
			}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
	
	
}

