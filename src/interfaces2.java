import java.util.Scanner;

interface course
{
void division(int a);
void modules(int b);
}
class stud implements course
{
String name;
int div,mod;
void name(String n)
{ name=n; }
public void division(int a)
{ div=a; }
public void modules(int b)
{ mod=b; }
void disp()
{
System.out.println("Name :"+name);
System.out.println("Division :"+div);
System.out.println("Modules :"+mod);
}
}
//--------main---------------
class usefulness
{
public static void main(String args[])
{ stud s=new stud();
s.name("Aaryash");
s.division(5);
s.modules(15);
s.disp();
}
}

/*root@Kira:~/Documents/Study Stuff/Lab Docs/Java Lab Docs# java usefulness
Name :Aaryash
Division :5
Modules :15 */

