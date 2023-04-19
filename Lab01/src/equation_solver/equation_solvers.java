package equation_solver;
import java.util.Scanner;
public class equation_solvers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter degree of eqution (1 or 2):");
		int degree = input.nextInt();
		if (degree == 1) {
			System.out.print("Number of variables:");
			short n = input.nextShort();
			if (n == 1) {
				System.out.print("Enter a:");
				double a = input.nextDouble();
				System.out.print("Enter b:");
				double b = input.nextDouble();
				if (a == 0) {
					
					System.out.println("a is not null");
				} else {
					System.out.println("x = " + -b / a);
				}
			}
			else if (n==2) {
				System.out.print("Enter a11:");
				double a11 = input.nextDouble();
				System.out.print("Enter a12:");
				double a12 = input.nextDouble();
				System.out.print("Enter a21:");
				double a21 = input.nextDouble();
				System.out.print("Enter a22:");
				double a22 = input.nextDouble();
				System.out.print("Enter b1:");
				double b1 = input.nextDouble();
				System.out.print("Enter b2:");
				double b2 = input.nextDouble();
				double D = a11*a22 - a12*a21;
				double x1 = (b1*a22-b2*a12)/D;
				double x2 = (b2*a11-b1*a21)/D;
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		else if (degree == 2) {
			System.out.print("Enter a:");
			double a = input.nextDouble();
			System.out.print("Enter b:");
			double b = input.nextDouble();
			System.out.print("Enter c:");
			double c = input.nextDouble();
			double delta = (b*b - 4*a*c);
			if (delta < 0){System.out.println("Non real solution.");}
			else if (delta == 0) {
				double x1 = (-b - Math.sqrt(delta))/(2*a*c);
				double x2 = (-b + Math.sqrt(delta))/(2*a*c);
				if (x1 == x2){System.out.println("x = " + x1);}
				else {System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);}
			}		
		}
		else {System.out.print("Error!");}
		
	}
}
