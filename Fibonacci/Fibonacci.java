public class Fibonacci {
	
	private static long[] fib = new long[1000];	
			
	public static void main(String[] Args) {
		fib[0] = 0;	fib[1] = 1;
		for(int i=2;i<1000;i++) {
			fib[i] = -1;
			// -1 means fibonacci of that number is not known
		}
		
		int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter fibonacci number to find:"));
		System.out.println("Fibonacci Number of "+n+":\n"+fib(n,fib));
	}
	
	public static long fib(int n, long[] fib) {
		//check if is known
		if(fib[n] != -1) {
			return fib[n];
		}
		//check if one operation is known
		if((fib[(n-1)] != -1) || (fib[(n-2)] != -1)) {
			//both known
			if((fib[(n-1)] != -1) && (fib[(n-2)] != -1)) {
				return fib[(n-1)] + fib[(n-2)];
			}
			//one known
			if(fib[(n-1)] != -1) {
				fib[(n-2)] = fib((n-2),fib);	//recursively call and store value
				return fib[(n-2)] + fib[(n-1)];
			}
			//other one known
			if(fib[(n-2)] != -1) {
				fib[(n-1)] = fib((n-1),fib);	//recursively call and store value
				return fib[(n-1)] + fib[(n-2)];
			}
		}
		//if no operations are known
		else {
			fib[n-2] = fib(n-2,fib);
			fib[n-1] = fib(n-1,fib);
			return fib[n-1] + fib[n-2];
		}
		return 0 ;	//error code
	}
}
