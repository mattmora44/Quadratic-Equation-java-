import java.util.Scanner;

class Quadratic{
	public static void main(String args[]){
		//get inputs
		Scanner input = new Scanner(System.in);
		System.out.println("ax^2 + bx + c");
		System.out.print("a: ");
		double a = input.nextDouble();
		System.out.print("b: ");
		double b = input.nextDouble();
		System.out.print("c: ");		
		double c = input.nextDouble();
		input.close();
		System.out.print(a);
		System.out.print("x^2 + (");
		System.out.print(b);
		System.out.print(")x + (");
		System.out.print(c);
		System.out.println(")");
		System.out.println("Root(s): ");
		double ans = 0.0;
		double ans2 = 0.0;
		//find method to solve
		
		if (a==0 && b == 0) { //error
			System.out.println("error- a and b are equal to 0.");
		}
		else if (a==0) { // linear 
			ans = -1*c/b;
			System.out.print("x = ");
			System.out.println(ans);
		}
		else if (b*b-4*a*c == 0) { //1 real root
			Rooter x = new Rooter();
			ans = x.findFroot(a, b, c);
			System.out.print("x = ");
			System.out.println(ans);
		}
		else if (b*b-4*a*c > 0) { //2 real roots
			Rooter x1 = new Rooter();
			Rooter x2 = new Rooter();
			ans = x1.findFroot(a,b,c);
			System.out.print("x1 = ");
			System.out.println(ans);
			ans2 = x2.findSroot(a, b, c);
			System.out.print("x2 = ");
			System.out.println(ans2);
		}
		else if (b*b-4*a*c < 0) { //imaginary
			ans = (Math.sqrt(-1*(b*b-4*a*c)))/(2*a);
			System.out.print("x1 = ");
			System.out.print(-1*b/(2*a));
			System.out.print(" +/- ");
			System.out.printf("%f.4 i",ans);
			//System.out.println("i");
		}
		
		else { //throw error
			System.out.println("error- dont know why!");
		}
		
	}
}