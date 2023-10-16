package solution01;

class Box<T extends Employee>
{
	private T obj;
	
	public T get()
	{
		return this.obj;
	}
	public void set(T obj)
	{
		this.obj=obj;
	}
	
	public double getTotalSalary() {
		return obj.calculateSalary();
		
	} 
}
public class Solution01Main {
	
	
	public static void main(String[] args) {
//		Box<Manager> b1 = new Box<>();
//		Manager m = new Manager(1,100,200);
//		b1.set(m);
//		
//		System.out.println(b1.getTotalSalary());
		
		Box<Employee> b1 = new Box<>();
//		b1.set(new Manager(1,100,200));
		b1.set(new SalesMan(1,100,200));
		
		
		
		System.out.println(b1.getTotalSalary());
		System.out.println(b1.get());
		
		
	}

}
