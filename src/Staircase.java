import java.util.Collections;

public class Staircase implements IPattern {
	
	int N = 10;

	public static void main(String[] args){
		IPattern obj = new Staircase();
		System.out.println(obj.printPattern(10));
		System.out.println(obj.printNthItem(10));
	}

	/**
	 * Print the pattern for n=10
	 
		         x
		        xx
		       xxx
		      xxxx
		     xxxxx
		    xxxxxx
		   xxxxxxx
		  xxxxxxxx
		 xxxxxxxxx
		xxxxxxxxxx
	 */	
	@Override
	public String printPattern(int n) {
		StringBuilder s = new StringBuilder();
		for(int stairs = 1; stairs <= n; stairs++){
			String spaces = String.join("", Collections.nCopies(n - stairs, " "));
			String ex = String.join("", Collections.nCopies(stairs, "x"));
			String bind = spaces + ex + "\n";
			s.append(bind);
		}

		return s.toString();
	}
	
	/**
	 * 	print the 10th line of the pattern:
	 	xxxxxxxxxx
	 */
	@Override
	public String printNthItem(int n) {
		String pattern = printPattern(N);
		String nthLine = pattern.split("\n")[n - 1];
		// TODO Auto-generated method stub
		return nthLine;
	}

	/**
	 * This changes the value of class variable N to arg.
	 */
	@Override
	public void setParam(int arg) {

		// TODO Auto-generated method stub
	}
}
