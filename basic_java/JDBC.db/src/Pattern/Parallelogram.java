package Pattern;

public class Parallelogram {

	public static void main(String[] args) {
		for(int i = 4; i >= 1; i--) {
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k < 4; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
