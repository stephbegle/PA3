/**
 * This function implements Pascal table printing
 * https://en.wikipedia.org/wiki/Pascal%27s_triangle
 * @author harsh
 */
public class PascalTriangle implements IPattern {
	
	/**
	 *
	 * Print the pascal triangle for n = 10
	                    1   
		              1   1   
		            1   2   1   
		          1   3   3   1   
		        1   4   6   4   1   
		      1   5   10  10  5   1   
		    1   6   15  20  15  6   1   
		  1   7   21  35  35  21  7   1   
		1   8   28  56  70  56  28  8   1   
	 */
	@Override
	public String printPattern(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 	Print the 10th line of pascal triangle
	 	1,8,28,56,70,56,28,8,1
	 */
	@Override
	public String printNthItem(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		IPattern obj = new PascalTriangle();
		System.out.println("Generating individual lines:");
		for(int i=1; i<10; i++)
		{
			System.out.println(obj.printNthItem(i));
		}
		System.out.println("Formatting into a pattern:");
		System.out.println(obj.printPattern(10));
	}

	@Override
	public void setParam(int arg) {
		// Leave this blank
	}

}
