package Que05;

import java.util.Scanner;

public class CircumferenceofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double circumference = 2 * Math.PI * radius;

        
        System.out.printf("The circumference of the circle "+circumference);

        

	}

}
