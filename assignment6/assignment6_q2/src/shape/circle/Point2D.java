package shape.circle;

public class Point2D {
	int x;
	int y;
	public Point2D()
	{
		
	}
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public String getDetails()
	{
		return ("("+x+","+y+")");
	}
	public boolean isEqual(Point2D p2)
	{
		return (this.x == p2.getX() && this.y == p2.getY()) ; 
	}
	
	public double calculateDistance(Point2D p2)
	{
		return  Math.sqrt( Math.pow(this.x-p2.getX(), 2) + Math.pow(this.y-p2.getY(), 2)     );
	}
}
