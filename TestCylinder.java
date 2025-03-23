import java.util.Scanner;
public class TestCylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***Cylinder***");
		System.out.println("------------------------");
		System.out.print("Please, enter the cylinder's base radius: ");
		double userRadius = input.nextDouble();
		
		System.out.println("------------------------");
		System.out.print("Please, enter the cylinder's height: ");
		double userHeight = input.nextDouble();
		
		Cylinder userCylinder = new Cylinder(userRadius, userHeight);
		System.out.println("------------------------");
		System.out.println(userCylinder.toString());
	}
}