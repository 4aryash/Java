import java.util.Scanner;


interface test
{
	int square();
}

class arithematicClass implements test
{
	int b;

	arithmeticClass(int x)
	{
		b = x;
		return b;
	}

	public int square()
	{
		return (b*b);
	}
	
}
class ToTestInt
{
	public int return_ans(int x)
	{
		aritmeticClass a=new arithmeticClass(x);
		return a.square();
	}
}
class main_class
{
	public static void main(String []args)
	{
		ToTestInt x= new ToTestInt();
		System.out.println("\nThe square of 64 is "+x.return_ans(64));
	}
}
