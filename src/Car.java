/** 
*
* Car
* 
* @Author Dour Marcellino
* @version 19-03-2020
*/
public class Car implements MovableObject{
	
    private double speed = 30.;
    
	@Override
	public Boolean canAccelerate() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		speed = speed + 5.;
	}

	@Override
	public double getTimeToMove(double d) {
		// TODO Auto-generated method stub
		return (d/speed)*60;
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		speed = speed - 5.;
	}
	
	public String toString() {
		return (this.getClass()).toString();
	}

}
