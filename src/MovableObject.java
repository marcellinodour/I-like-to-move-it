/** 
* @Author Dour Marcellino
* @version 19-03-2020
*/
public interface MovableObject {
	
	/** 
	* Method that can tell the user if the object
	* can accelerate
	* @return boolean
	*/
	public Boolean canAccelerate();
	
	/** 
	* Acceleration method
	* if the object can't accelerate,
	* the method does nothing
	* @return nothing
	*/
	public void accelerate();
	
	/** 
	* Method that return to the user the time
	* that the object have to take to
	* reach the distance d
	* @return double time
	*/
	public double getTimeToMove(double d);
	
	/** 
	* Method to brake a movable object
	* @return double time
	*/
	public void brake();
	
	/** 
	* Method to String
	* @return double time
	*/
	public String toString();
}
