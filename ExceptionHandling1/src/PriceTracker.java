import java.util.*;

public class PriceTracker {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int numberOfThing = 0;
			System.out.println("Please enter the number of things whoes price need to be entered ");
			try {
				numberOfThing = sc.nextInt();	
			}
			catch (InputMismatchException e) {

		        System.out.print("Enter the number of things in integer ");

		     }
			int[] price = new int[numberOfThing];
			
			for(int i = 0 ; i < numberOfThing ; i++ ) {
				System.out.println("Please enter the price ");
				try {
					price[i] = sc.nextInt();
				}
			    catch (InputMismatchException e) {
			        System.out.print("Enter the price in integer");
			        System.exit(0);
			     }
			}
			
			//displaying values
			System.out.println("enter the value whoes value you need to check");
			
			try {
				int index = sc.nextInt();
				System.out.println(price[index]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("The Index does not exits");
			}
			
		}
}
