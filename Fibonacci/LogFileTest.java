
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

/*
 * We want to write to a file so we can apply it to the Fibonacci algorithm
 * to store computation results to reduce amount of computations needed
 * and implement Dynamic Programming
 */

public class LogFileTest {

	//Write array of integers to file
	public void write(long[] arr) {
	    String s = arr.toString();
	    byte data[] = s.getBytes();
	    Path p = Paths.get("./logfile.txt");
	
	    try (OutputStream out = new BufferedOutputStream(
	      Files.newOutputStream(p, CREATE, APPEND))) {
	      out.write(data, 0, data.length);
	    } catch (IOException x) {
	      System.err.println(x);
	    }
	}
	
	public long read() {
		//TODO
		return 0;
	}
	
}