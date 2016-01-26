package rp.assignments.individual.ex1;
import lejos.nxt.TouchSensor;
import lejos.nxt.TouchSensorListener;
import lejos.nxt.TouchSensorListener.sensorPressed
public class part2 {
	public static void main(String[]args) throws InterruptedException{
		TouchSensor touchSensor = new TouchSensor(SensorListener.S1);
		
		int freq<100;
		while (true){
			if (touchSensorListener.sensorPressed()){
				Sound.beepSequence();
				Thread.run();
			}
		}
		int freq>100;
		while (true){
			if (touchSensorListener.sensorPressed()){
				Sound.beepSequence();
				Thread.stop();	
			}
		}
		
	}
}
