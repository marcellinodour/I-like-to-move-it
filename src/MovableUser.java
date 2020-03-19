/** 
* @Author Dour Marcellino
* @version 19-03-2020
*/

public class MovableUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstantSpeedMovable car_1 = new ConstantSpeedMovable();
		GenericMovable car_2 = new GenericMovable();
		GenericMovable car_3 = new GenericMovable();
		
		System.out.println("Time to move car 1 after 1 km : " + getTotalTime(car_1) );
		System.out.println("Time to move car 2 after 1 km : " + getTotalTime(car_2) );
		System.out.println("Time to move car 3 after 1 km : " + getTotalTime(car_3) );
	}
	
	public static double getTotalTime(MovableObject movable) {
		double totalTime;
		
		totalTime = movable.getTimeToMove(1);
		movable.brake();
		totalTime = totalTime + movable.getTimeToMove(0.1);
		movable.accelerate();
		totalTime = totalTime + movable.getTimeToMove(1);
		
		return totalTime;
	}

}
