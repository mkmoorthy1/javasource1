class TestFunctional1 
{
	public static void main(String[] args) 
	{
		Greeting greetMe=()->System.out.println("Hello World");
		greetMe.greeting();
	}
}
@FunctionalInterface
interface Greeting
{
public void greeting();
}