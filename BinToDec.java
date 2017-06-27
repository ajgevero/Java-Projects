import java.util.Scanner;

public class BinToDec {
	private static int arry[] = new int[8];
	
	public static void main(String[] args) {
		takeBin();
		if (checkNumber() == true) {
			System.out.println(Construct());
		}
		else{
			System.out.println("Sorry, the number you've entered is invalid.");
		}
	}
	
	public static void takeBin(){
		System.out.println("Enter 8 bits of your binary number: ");
		int dec = new Scanner(System.in).nextInt();
		for (int a = 7; a >= 0; a--){
			arry[a] = (dec % 10);
			dec /= 10;
		}
	}
	
	public static boolean checkNumber(){
		boolean check = false;
		for (int i : arry){
			if (i == 0 || i == 1){
				check = true;
			}
			else{
				return false;
			}
		}
		return check;
	}
	
	public static int Construct() {
		int e = 7;
		int temp = 0;
		for (int i : arry){
			if (i == 1){
				temp += Math.pow(2, e);
				e--;
			}
			else if (i == 0) {
				e--;
			}
		}
		System.out.println("Here is your number in Base-10 Decimal: ");
		return temp;
	}	
}
	
