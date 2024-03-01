package basic_java;

public class basicDemo {
	private static void mathDemo() {
		double random = Math.random();
		int winner = (int)(random*100)+1;
		System.out.println(random);
		System.out.println(winner);
	}
	public static void main(String[] args) {
 mathDemo();
	
  }
}
