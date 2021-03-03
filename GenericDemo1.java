class GenericDemo1 
{
	public static void main(String[] args) 
	{
		SomeFunc<String> demo1=(str)->
		{
			String reverse="";
			for(int i=str.length()-1;i>=0;i--)
			{
					reverse= reverse+str.charAt(i);
			}

			return reverse;
		};

		System.out.println("Reverse = "+demo1.func("Raj"));


		
		SomeFunc<Integer> factorial=number->
		{	
				
				int result=1;
				for(int i=1;i<=number;i++)
				{
					result *= i;
				}

				return result;
		};

		System.out.println("Result= "+factorial.func(5));
	}	
}


interface SomeFunc<T> {
	
	T func(T t);


}