/**
 * This function implements multiplication table printing.
 * https://en.wikipedia.org/wiki/Multiplication_table
 * @author harsh
 *
 */
public class MultTable implements IPattern {
	 int N = 1;


    public static void main(String[] args){

        IPattern obj = new MultTable();
        System.out.println(obj.printNthItem(5));
        System.out.println(obj.printPattern(10));
    }
    
    /**
	For N=1,n=10 this prints:
	1 * 1 = 1
	1 * 2 = 2
	1 * 3 = 3
	1 * 4 = 4
	1 * 5 = 5
	1 * 6 = 6
	1 * 7 = 7
	1 * 8 = 8
	1 * 9 = 9
	1 * 10 = 10	
     */
	@Override
	public String printPattern(int n) {
		// TODO Auto-generated method stub
		int i;
		StringBuilder m = new StringBuilder();
		String line;
		int result;
		for(i = 1; i <= n; i++){
			result = 1 * i;
			line = "1 * " + Integer.toString(i) + " = " + Integer.toString(result);
			m.append(line + "\n");
		}

		return m.toString();
	}

	/**
	 * 
	 For N=1,n=5 this prints:
	 1 * 5 = 5
	 */
	@Override
	public String printNthItem(int i) {
		// TODO Auto-generated method stub
		String pattern = printPattern(i);
		String nthItem = pattern.split("\n")[i - 1];
		return nthItem;
	}

	/**
	 * This changes the value of class variable N to arg.
	 */
	@Override
	public void setParam(int arg) {
		// TODO Auto-generated method stub
	}
}
