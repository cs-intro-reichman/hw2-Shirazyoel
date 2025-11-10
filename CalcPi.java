// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		double d = 1;
		int i = 1;
		double pi4 = 0;

		while (i <= n) {
		 double x = 1 / d;

		 if (i%2 == 0)
	     pi4 = pi4 - x;
		 else 
	     pi4 = pi4 + x;

		 i++;
		 d = d + 2;

		}
		System.out.println("pi according to java: " + Math.PI);
		System.err.println("pi approximated:" + (pi4*4));

		

	}
}
