import java.util.ArrayList;

/**
 * This class implements Fibonacci pattern printing
 * https://en.wikipedia.org/wiki/Fibonacci_number
 * @author harsh
 *
 */
public class Fibonacci implements IPattern {

	public static void main(String[] args){
		IPattern obj = new Fibonacci();
		System.out.println(obj.printNthItem(5));
		System.out.println(obj.printPattern(5));
	}


	/**
	 *
	 	Prints following for n = 5:
		0 1 1 2 3
	 */
	@Override
	public String printPattern(int n) {
        if (n < 0) {
            return "Incorrect input";
        } else if (n == 0) {
            return String.join(" ", "0");
        } else if (n == 1) {
            return String.join(" ", "1");
        }

        int a = 0;
        int b = 1;
        String[] arr = new String[n];
        arr[0] = Integer.toString(a);
        arr[1] = Integer.toString(b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            arr[i] = Integer.toString(c);
            a = b;
            b = c;
        }
        return String.join(" ", arr);
    }

	/**
	 *
		Prints following for n = 5:
		3
	 */
	@Override
	public String printNthItem(int n) {
		// TODO your code here
        String fiboString = printPattern(n);
        String[] fiboArr = fiboString.split(" ");
        String nthItem = fiboArr[fiboArr.length - 1];
        return nthItem;
	}

	@Override
	public void setParam(int arg) {
		// Leave this blank
	}
}
