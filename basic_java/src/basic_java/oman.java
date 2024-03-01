package basic_java;

public class oman {
	public static void main(String[] args) {
		//Round
       long a = Math.round(24.5);
       int b = Math.round(24.4f);
       System.out.println(a);
       System.out.println(b);
       
       //Round-up
       double c = Math.ceil(25.1);
       double d = Math.ceil(25.0);
       System.out.println(c);
       System.out.println(d);
       
       //Round-down
       double e = Math.floor(12.45);
       double f = Math.floor(12.0);
       System.out.println(e);
       System.out.println(f);
    }


}