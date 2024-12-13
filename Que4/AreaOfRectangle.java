package Que4;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        
        double area = length * width;

      
        System.out.printf("The area of the rectangle "+area);

       

	}

}
