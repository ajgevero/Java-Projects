import java.util.Scanner;
public class BinToDec {
	private static int arry[] = new int[8];
	
	public static void main(String[] args) {
		takeBin();			// Go to takeBin method
		if (checkNumber() == true) {						// Conditional checks checkNumber method
			System.out.println("\n" + Construct());
		}
		else{
			System.out.println("Sorry, the number you've entered is invalid.");
		}
		main(args);
	}
	
	public static void takeBin(){
		System.out.println("Enter 8 bits of your binary number: ");		// Prompt
		int dec = extracted().nextInt();			//receives user input (8-bit decimal)
		for (int a = 7; a >= 0; a--){		// For loop de-constructs the input into its digits and places in an array
			arry[a] = (dec % 10);
			dec /= 10;
		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);			// Closes scanner
	}
	
	public static boolean checkNumber(){			
		boolean check = false;		// Boolean value instantiated as initially false
		for (int i : arry){
			if (i == 0 || i == 1){
				check = true;		// if there is a 1 or 0 digit, the Boolean check is changed to true
			}
			else{
				return false;		// if there is any number that is not 1 or 0 the boolean is instantly returned false
			}
		}
		return check;
	}
	
	public static int Construct() {
		int e = 7;		// exponent value
		int temp = 0;
		for (int i : arry){		//incrementally adds the value of the bit if its binary value is 1
			if (i == 1){
				temp += Math.pow(2, e);
				e--;
			}
			else if (i == 0) {
				e--;
			}
		}
		return temp;
	}	
}
