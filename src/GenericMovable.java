/** 
*
* Generic movable object is an object that can accelerate,
* brake, and has the initial speed as 30. km/h
* 
* @Author Dour Marcellino
* @version 19-03-2020
*/
public class GenericMovable implements MovableObject{
	
    private double speed = 30.;
	
	@Override
	public Boolean canAccelerate() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		speed = speed + 3.;
	}

	@Override
	public double getTimeToMove(double d) {
		// TODO Auto-generated method stub
		return (d/speed)*60;
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		speed = speed - 2.;
	}

}
