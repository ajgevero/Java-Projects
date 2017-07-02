import java.util.Scanner;

public class DecToBin {
	public static int arry[] = new int[8];
	
	public static void main(String[] args) {
		System.out.println("Enter any base-10 decimal from 0 - 255: ");
		int dec = extracted().nextInt();
		BreakDown(dec);
		for (int i : arry){
			System.out.print(i);
		}
		System.out.println("\n");
		main(args);
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	
	public static void BreakDown(int x) {
		int arrycnt = 0;
		for (int e = 7; e >= 0; e--){
			if (x >= ((int) Math.pow(2, e))){
				arry[arrycnt] = 1;
				x -= ((int) Math.pow(2, e));
				
			}
			
			else {
				arry[arrycnt] = 0;
			}
			arrycnt++;
		}
	}

}
