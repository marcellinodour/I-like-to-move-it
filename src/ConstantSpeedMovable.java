/** 
 * 
* A constant speed movable object is an object that can't accelerate.
* which has the initial speed of 20. km/h
* 
* @Author Dour Marcellino
* @version 19-03-2020
*/
public class ConstantSpeedMovable implements MovableObject {
	private final double speed = 20.0;
	
	ConstantSpeedMovable(){
	}
	
	
	@Override
	public Boolean canAccelerate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTimeToMove(double d) {
		// TODO Auto-generated method stub
		return (d/speed)*60;
	}


	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

}
