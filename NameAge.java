import java.util.Scanner;

public class NameAge{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("-----------NameAge--------");
	System.out.println("");
	System.out.println("");

	int i = 1;
	int x = 0;
	String name = "";

	System.out.print("Enter your name: ");
	name = input.next();

	System.out.print("Enter your age: ");
	x = input.nextInt();

	while (i <= x){
		System.out.println(i+ ". "+name);
		i++;}

	Index.main(null);
}}