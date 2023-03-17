package practice;

class Arithmetic {
	
	public int add(int x, int y)
	{
		return x+y;
	}
	
	public double add(double x, double y)
	{
		return x+y;
	}

	public static void main(String[] args)
	{
		Arithmetic arith = new Arithmetic();
		int sum1 = arith.add(2, 3);
		double sum2 = arith.add(2.5, 3.5);
		
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
