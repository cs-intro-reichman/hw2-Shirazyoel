// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]); 
		String mood = (args[1]);
		int count = 0;
		int num;

		if (mood.equals("v")) {

			for (int i = 1; i <= N; i++) {
				count = 0;
				num = i;
				do {
					System.out.print(num + " ");
					count++;
					if (num % 2 == 0) {
						num = num / 2;
					}
					else {
						num = num * 3 + 1;
					}

					if (num == 1) {
						System.out.print(num + " ");
						count++;
					}
				}
				
				while (num != 1); 
				
				System.out.println( "(" + count + ")" );	
			}
		} 
				   
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	
	}
}
