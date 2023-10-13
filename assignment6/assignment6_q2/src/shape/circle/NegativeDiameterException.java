package shape.circle;

public class NegativeDiameterException extends RuntimeException{
	
	double diameter;
	
	public NegativeDiameterException(double diameter) {
		this.diameter=diameter;
	}
	public String toString()
	{
		return "Negative value for Diameter is Invalid, Diameter Value : "+this.diameter;
	}
	
}
