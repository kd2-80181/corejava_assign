package shape.circle;

public class Circle {
	private Point2D centerPoint;
	private double diameter;
	
	Circle()
	{
		this(new Point2D(0,0),100);
	}
	
	Circle(Point2D center,int diameter)
	{
		centerPoint=new Point2D(center.x,center.y);
		this.diameter=diameter;
		invariant();
	}
	
	public int getCenterX()
	{
		return centerPoint.x;
	}
	
	public int getCenterY()
	{
		return centerPoint.y;
	}
	
	public double getDiameter()
	{
		return this.diameter;
	}
	public void setDiameter(int diameter)
	{
		this.diameter=diameter;
		invariant();
	}
	
	public void invariant()
	{
		if(this.diameter<0) {
			throw new NegativeDiameterException(this.diameter);//unchecked Exception
		}
	}
}
