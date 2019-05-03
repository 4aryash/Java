package bin;

class GetNameSetName
{
public static void main(String arg[])
{
System.out.println(Thread.currentThread().getName());
Thread.currentThread().setName("New Thread");
System.out.println(Thread.currentThread().getName());
}
}
