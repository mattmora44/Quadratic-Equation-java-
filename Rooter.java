
public class Rooter {
	public double findFroot(double a, double b, double c) {
		return (-1*b + Math.sqrt(b*b-4*a*c))/(2*a);
	}
	public double findSroot(double a, double b, double c) {
		return (-1*b - Math.sqrt(b*b-4*a*c))/(2*a);
	}
}
