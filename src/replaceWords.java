import java.util.Scanner;

class replaceWords{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a String");
		String enteredString= scanner.nextLine();
		System.out.println("String is: "+enteredString);

		System.out.println("The String after replacement is:");
		System.out.println(enteredString.replace("Hello","World"));
	}
}
