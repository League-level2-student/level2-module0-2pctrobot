package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
public static void main(String[] args) {
	Random ran1 = new Random();
	Robot V1 = new Robot();
	Robot V2 = new Robot();
	Robot Gabriel = new Robot();
	Robot Minos = new Robot();
	Robot Sisyphus = new Robot();
	Robot[] machine = { V1,V2,Gabriel,Minos,Sisyphus };
	for (int i = 0; i < machine.length; i++) {
		machine[i].setX(225*i);
		machine[i].setY(500);
	}
	for (int i = 0; i < machine.length; i++) {
		machine[i].setSpeed(25);
	}
	while(machine[0].getY()>0) {
		int number1 = ran1.nextInt(50);
		machine[0].move(number1);
		int number2 = ran1.nextInt(50);
		machine[1].move(number2);
		int number3 = ran1.nextInt(50);
		machine[2].move(number3);
		int number4 = ran1.nextInt(50);
		machine[3].move(number4);
		int number5 = ran1.nextInt(50);
		machine[4].move(number5);
	}
	if(machine[0].getY()<=0) {
		
	}else if(machine[1].getY()<=0) {
		
	}else if(machine[2].getY()<=0) {
		
	}else if(machine[3].getY()<=0) {
		
	}else if(machine[4].getY()<=0) {
		
	}
	
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
