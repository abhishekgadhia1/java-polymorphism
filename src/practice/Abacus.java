package practice;

public class Abacus {
	
	public int add(int x, int y)
	{
		return x+y;
	}
	
	public double add(double x, double y)
	{
		return x+y;
	}

	public static void main(String[] args) {
		
		Abacus aba = new Abacus();
		int sum1 = aba.add(2, 3);
		double sum2 = aba.add(2.5, 3.5);
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
