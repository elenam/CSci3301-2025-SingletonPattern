package chocolate;

public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		
		// comparing references with == to make sure it's the same object:
		if (boiler == boiler2) {
			System.out.println("It's the same boiler!");
		} else {
			System.out.println("This is a different boiler...");
		}
	}
}