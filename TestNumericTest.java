class TestNumericTest
{
	public static void main(String[] args) 
	{
		NumericTest testEven=(n)->(n%2==0);
		System.out.println(testEven.testIsEven(10));

		Opr opr1= (a,b)->System.out.println(a+b);

		opr1.opr(10,15);

		
		MathOpr testAdd1=(a,b)->{return (a+b);};
		//or
		MathOpr testAdd2=(a,b)->(a+b);
		System.out.println(testAdd2.opr(10,20));
	}
}

interface NumericTest
{
	boolean testIsEven(int num);

}

interface Opr
{
	void opr(int a,int b);
}

interface MathOpr
{
	int opr(int a,int b);
}