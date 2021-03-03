class MathDemo
{
	public static void main(String[] args) 
	{
		Mathopreation opr=(a,b)->System.out.println(a+b);
		opr.demo1(10,20);
	}
}

@FunctionalInterface
interface Mathopreation
{
	void demo1(int n1,int n2);

	
}