package fibonaccinum;

public class fibonacci {
	 public static void main(String[] args) {
	        int generations = 19;
	        // Array to store Fibonacci numbers
	        long[] fibonacci = new long[generations];
	        // Initializing the first two Fibonacci numbers
	        fibonacci[0] = 0; // First generation
	        fibonacci[1]=1;
	        // Generating the Fibonacci sequence
	        for (int i = 2; i < generations; i++) {
	            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
	        }
	        // Printing the Fibonacci sequence
	        System.out.println("Fibonacci sequence for " + generations + " generations:");
	        for (int i = 0; i < generations; i++) {
	            System.out.print(fibonacci[i] + " ");
	        }
	    }
}


