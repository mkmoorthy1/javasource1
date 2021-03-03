interface Greeting
{
public void greeting();
}
interface GreetUser
{
public void greeting(String user);
}
class DemoLambda1
{
	public static void main(String[] args)
	{
			Greeting greet1=()->{System.out.println("Hello World from Greet 1");};
			greet1.greeting();

			Greeting greet2=()->System.out.println("Hello World from Greet 2");
			greet2.greeting();

			/*Greeting greet2=()->System.out.println("Hello World From Greet 2");
			greet2.greeting();*/
			String uname="Sachin";
			GreetUser greetUser=(user)->System.out.println("Hello "+user);
			greetUser.greeting(uname);
		}
}