import java.util.Scanner;

public class Months{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("-----------Months----------");
	System.out.println("");
	System.out.println("");


	String[] array = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


	String searchStr = "r";
	Boolean found = false;

	for(int i = 0; i < array.length; i++){
		if(array[i].contains(searchStr)){
			System.out.println(array[i]);
	}}
	Index.main(null);
}}