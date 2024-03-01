package basic_java;


public class Ayaz {
	static void arrayMax(int b[]){
		int max=b[0];
		for(int i=0;i<b.length;i++) {
			if(max<b[i]) {
				max =b[i];
				
			}
			System.out.println("maxvalue"+ ""+ max);
		}
	
		
		
		
	}
	static void arrayMin(int b[]){
		int min=b[0];
		for(int i=0;i>b.length;i++) {
			if(min<b[i]) {
				min =b[i];
				System.out.println(+min);
			}
					     
		}
	
		
		
		
	}
	public static void main(String[] args) {
	 int arr[]=new int [] {1,43,65,32,23};
		  arrayMax(arr);
	       arrayMin(arr);
		  
	}

}
