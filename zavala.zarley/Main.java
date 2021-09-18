import java.util.Scanner;
import animal.carnivore.*;
import animal.herbivore.*;
import animal.*;

public class Main {
	public static void main(String[] args) {
	    
	 	Lion tom = new Lion();
		Lion steve = new Lion();
		Lion rupert = new Lion();
		Giraffe jim = new Giraffe();
		Giraffe ted = new Giraffe();
		Giraffe max = new Giraffe();
				
		Animal[] animals = new Animal[] {jim, tom, rupert, max, steve, ted};

		System.out.println("There are " + animals.length + " animals in the array.\n");
		System.out.println("Enter a number to find the animal at that location!:\n");

		Scanner input = new Scanner(System.in);
		int index = input.nextInt();

		try {
			System.out.println(animals[index - 1].getName());
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("You entered an invalid number!");
		}
		finally {
			System.out.println("Goodbye!");
		}
		
		//System.out.println(tom.speak());
		//System.out.println(jim.speak());
	}
}