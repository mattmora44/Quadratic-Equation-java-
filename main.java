import java.util.Scanner;

class Quadratic{
	public static void main(String[] args){
		//get inputs
		Scanner input = new Scanner(System.in);
		System.out.println("ax^2 + bx + c");
		System.out.print("a: ");
		double a = input.nextDouble();
		System.out.print("b: ");
		double b = input.nextDouble();
		System.out.print("c: ");		
		double c = input.nextDouble();
		//solve
		System.out.print(a);
		System.out.print("x^2 + (");
		System.out.print(b);
		System.out.print(")x + (");
		System.out.print(c);
		System.out.println(")");
		System.out.println("Roots: ");
	}
}