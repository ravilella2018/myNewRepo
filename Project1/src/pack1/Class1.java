package pack1;

public class Class1 
{
	int c;
	
	public void add(int a, int b)
	{
		c=a+b;
		System.out.println("Addition of A & B is :" + c);
	}
	
	public void sub(int a, int b)
	{
		c=a-b;
		System.out.println("Substraction of A & B is :" + c);
	}

	public static void main(String[] args) 
	{
		Class1 obj=new Class1();
		obj.add(10, 20);
		obj.sub(100, 200);

	}

}
