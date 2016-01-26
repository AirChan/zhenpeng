package rp.assignments.individual.ex1;
import rp.robotics.DifferentialDriveRobot;
import rp.systems.StoppableRunnable;
public class part1 {
	public static void TriangleController main(String[]args){
		DifferentialPilot pilot = new DifferentialPilot(
				Robotconstants.WHEEL_DIAMETER_CM,
				Robotconstants.TRACK_WIDTH_CM, Motor.A,
				Motor.C);
		pilot.travel(8);
		pilot.rotate(60);
		pilot.travel(6);
		
	public static void SquareController main(String[]args){
		DifferentialPilot pilot = new DifferentialPilot(
				Robotconstants.WHEEL_DIAMETER_CM,
				Robotconstants.TRACK_WIDTH_CM, Motor.A,
				Motor.C);
		pilot.travel(8);
		pilot.rotate(90);
		pilot.travel(6);
		
	public static void DecagonController main(String[]args){
		DifferentialPilot pilot = new DifferentialPilot(
				Robotconstants.WHEEL_DIAMETER_CM,
				Robotconstants.TRACK_WIDTH_CM,Motro.A,
				Motor.C);
		pilot.travel(8);
		pilot.rotate(144);
		pilot.travel(6);
		}
	}
}
