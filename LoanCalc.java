/**
* Computes the periodical payment necessary to re-pay a given loan.
*/
public class LoanCalc {
	
	static double epsilon = 0.001;  // The computation tolerance (estimation error)
	static int iterationCounter1; 
	static int iterationCounter2;  // Monitors the efficiency of the calculation
	
    /** 
     * Gets the loan data and computes the periodical payment.
     * Expects to get three command-line arguments: sum of the loan (double),
     * interest rate (double, as a percentage), and number of payments (int).  
     */
	public static void main(String[] args) {		
		// Gets the loan data
		double loan = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		System.out.println("Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);
		
		// Computes the periodical payment using brute force search
		System.out.print("Periodical payment, using brute force: ");
		System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter1);

		// Computes the periodical payment using bisection search
		System.out.print("Periodical payment, using bi-section search: ");
		System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter2);
	}
	
	/**
	* Uses a sequential search method  ("brute force") to compute an approximation
	* of the periodical payment that will bring the ending balance of a loan close to 0.
	* Given: the sum of the loan, the periodical interest rate (as a percentage),
	* the number of periods (n), and epsilon, a tolerance level.
	*/
	// Side effect: modifies the class variable iterationCounter.
    public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {  
    	
    	double g = loan / n ;
    	double balance = endBalance(loan, rate, n, g);
    	boolean endpay = false;
    	while ( endpay == false )
    	{
    		balance = endBalance(loan, rate, n, g);
    		if (balance > 0)
    		{
    			g = g + epsilon;
    			iterationCounter1++; 

    		}
    		else endpay = true;

    	}
    	return g;
    }
    
    /**
	* Uses bisection search to compute an approximation of the periodical payment 
	* that will bring the ending balance of a loan close to 0.
	* Given: the sum of theloan, the periodical interest rate (as a percentage),
	* the number of periods (n), and epsilon, a tolerance level.
	*/
	// Side effect: modifies the class variable iterationCounter.
    public static double bisectionSolver(double loan, double rate, int n, double epsilon) { 

    	double l = loan / n ;
    	double h = loan; 
    	double g = (l+h) / 2;
    	boolean endpay = false;
    	while (h - l > epsilon)
    	{
    		if (endBalance(loan, rate, n, g) * (endBalance(loan, rate, n, l)) > 0)
    		{
    			l = g;
    		}
    		else 
    		{
    			h = g;
	
    		}
    		iterationCounter2++;
    		g = (l+h) / 2;

    	}
    	return g;
   
    }
	
	/**
	* Computes the ending balance of a loan, given the sum of the loan, the periodical
	* interest rate (as a percentage), the number of periods (n), and the periodical payment.
	*/
	private static double endBalance(double loan, double rate, int n, double payment) {
		
    	for ( int i=1; i <= n ;i++)
    	{
    		loan = loan - payment;
    		loan = loan * (1+(rate/100));
    		
    	}
    	return loan; 

	}
}