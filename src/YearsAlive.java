import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class YearsAlive {
	static Robot robot = new Robot();
	public static void main(String[] args) {

		robot.show();
		robot.penDown();

String shape = JOptionPane.showInputDialog(null, "Do you my robot to draw a circle, a square or a triangle");
	if (shape.equals("square")) {
		robot.setSpeed(5);
		String color = JOptionPane.showInputDialog(null, "What color (red, black or blue) you want your square to be?");
		if (color.equals("red")) {
			robot.setPenColor(250, 0, 0);}
			else if (color.equals("black")) {
				robot.setPenColor(0, 0, 0);}
			else if (color.equals("blue")) {
				robot.setPenColor(0, 0, 250);}
		makeSquare ();
}
	else if (shape.equals("triangle")) {
		JOptionPane.showMessageDialog(null, "His favorite!");
		robot.setSpeed(5);
		String color = JOptionPane.showInputDialog(null, "What color (red, black or blue) you want your triangle to be?");
		if (color.equals("red")) {
			robot.setPenColor(250, 0, 0);}
			else if (color.equals("black")) {
				robot.setPenColor(0, 0, 0);}
			else if (color.equals("blue")) {
				robot.setPenColor(0, 0, 250);}
			makeTriangle ();}
	else if (shape.equals("circle")) {
		robot.setSpeed(100);
		String color = JOptionPane.showInputDialog(null, "What color (red, black or blue) you want your circle to be?");
		if (color.equals("red")) {
			robot.setPenColor(250, 0, 0);}
			else if (color.equals("black")) {
				robot.setPenColor(0, 0, 0);}
			else if (color.equals("blue")) {
				robot.setPenColor(0, 0, 250);}
		makeCircle();}
	}
static void makeSquare () {
	for (int i = 0; i < 4; i++) {
		robot.move(90);
		robot.turn(90);
	}
}
static void makeTriangle () {
robot.turn(270);
for (int i = 0; i < 3; i++) {
	robot.move(90);
	robot.turn(120);}
}
static void makeCircle () {
	for (int i = 0; i < 360; i++) {
		robot.move(1);
		robot.turn(1);
		}
}
}