package Overloadding;

public class Addition {
	
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	public void add(double r,int s)
	{
		double c;
		c=r/s;
		System.out.println(c);
	}
	public void add(int l, double m)
	{
		double c;
		c=l+m;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.add();
		a.add(55, 55);
		a.add(55.55, 400);
		a.add(400,55.56);
	}
	

}
