
public class FibSimple {
	public static int fib(int n) {
		if(n==0)	return 0;
		if(n==1)	return 1;
		return fib(n-2) + fib(n-1);
	}
	
	public static void main(String[] Args) {
		int num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter number: "));
		
		System.out.println(fib(num));
	}
}
