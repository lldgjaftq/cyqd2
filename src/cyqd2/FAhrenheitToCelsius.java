package cyqd2;
import java.util.Scanner;
public class FAhrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0/9)*(fahrenheit-32);
		System.out.print("Fahrenheit "+fahrenheit+" is " + 
		celsius + " in Celsuis");

	}

}
