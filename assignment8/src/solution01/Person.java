package solution01;
import java.util.Scanner;

public class Person {
	private String name = "Person";
	public Person() {
		this("");
	}
	public Person(String name) {
		this.name = name;
	}
	public void accept(Scanner sc) {
        System.out.println("Enter name : ");
        this.name= sc.next();
    }
    public void display() {
        System.out.println(" Name : "+this.name);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
