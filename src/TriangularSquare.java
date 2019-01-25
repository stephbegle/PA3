public class TriangularSquare implements IPattern {

	int N = 10;
	
	/**
	 * Prints the following pattern for n = 10:

		* * * * *  * * * * *
		* * * *      * * * *
		* * *          * * *
		* *              * *
		*                  *
		*                  *
		* *              * *
		* * *          * * *
		* * * *      * * * *
		* * * * *  * * * * *
		
		Prints the following pattern for n = 11:
		
		* * * * *  * * * * *
		* * * *      * * * *
		* * *          * * *
		* *              * *
		*                  *
		                    
		*                  *
		* *              * *
		* * *          * * *
		* * * *      * * * *
		* * * * *  * * * * *
		 
	 * 
	 */
	@Override
	public String printPattern(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 
		Printing 3rd item for N=10
		* * *          * * *
		Printing 7th item for N=11
		*                  *

	 */
	@Override
	public String printNthItem(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		IPattern obj = new TriangularSquare();
		obj.setParam(10);
		System.out.println("Printing 3rd item for N=10");
		System.out.println(obj.printNthItem(3));
		
		obj.setParam(11);
		System.out.println("Printing 7th item for N=11");
		System.out.println(obj.printNthItem(7));
		
		System.out.println("Printing Pattern:");
		System.out.println(obj.printPattern(11));
	}
	
	/**
	 * This function sets the value of N
	 */
	@Override
	public void setParam(int arg) {
		// TODO Auto-generated method stub
	}

}
