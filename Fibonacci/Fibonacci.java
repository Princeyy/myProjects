<<<<<<< HEAD
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
=======
public class Fibonacci {
	
	LogFileTest logFile = new LogFileTest();
	private static long[] fib = new long[1000];	
			
	public static void main(String[] Args) {
		Fibonacci test = new Fibonacci();
		fib[0] = 0;	fib[1] = 1;	
		test.resetLogFile();
		int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter fibonacci number to find:"));
		System.out.println("Fibonacci Number of "+n+":\n"+test.fib(n,fib));
	}
	
	public long fib(int n, long[] fib) {
		//check if is known
		if(fib[n] != -1) {
			return fib[n];
		}
		//check if one operation is known
		if((fib[(n-1)] != -1) || (fib[(n-2)] != -1)) {
			//both known
			if((fib[(n-1)] != -1) && (fib[(n-2)] != -1)) {
				logFile.write(fib);
				return fib[(n-1)] + fib[(n-2)];
			}
			//one known
			if(fib[(n-1)] != -1) {
				fib[(n-2)] = fib((n-2),fib);	//recursively call and store value
				logFile.write(fib);
				return fib[(n-2)] + fib[(n-1)];
			}
			//other one known
			if(fib[(n-2)] != -1) {
				fib[(n-1)] = fib((n-1),fib);	//recursively call and store value
				logFile.write(fib);
				return fib[(n-1)] + fib[(n-2)];
			}
		}
		//if no operations are known
		else {
			fib[n-2] = fib(n-2,fib);
			fib[n-1] = fib(n-1,fib);
			logFile.write(fib);
			return fib[n-1] + fib[n-2];
		}
		return 0 ;	//error code
	}
	
	public void resetLogFile() {
		for(int i=2;i<1000;i++) {
			fib[i] = -1;
			// -1 means fibonacci of that number is not known
		}
		logFile.write(fib);
	}
}
>>>>>>> 5788962ff4930b640531691251169cd8e9d23c03
