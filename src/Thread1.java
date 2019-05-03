package bin.practice;

class A extends Thread{
    public void run(){
        System.out.println("Program Success.");
    }
}

public class Thread1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		A t= new A();
		t.start();
	}
}
