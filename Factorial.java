class Factorial 
{
	static int factorialDemo(int n)
	{
		if(n == 0)
			return 1;
		else
			return(n * factorialDemo(n-1));
	}
	public static void main(String a[])
	{
		int i,fact =1;
		int number = 5;
		fact = factorialDemo(number);
		System.out.println("Factorial of "+ number + " is: " + fact);
	}
}