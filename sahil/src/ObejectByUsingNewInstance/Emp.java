package ObejectByUsingNewInstance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Emp {

	public static void main(String[] args) {
		
		Details details = new Details();
		details.dis(1);
		
		try {
			
			FileOutputStream fStream = new FileOutputStream("hello.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fStream);
			objectOutputStream.writeObject(details);
			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileInputStream = new FileInputStream("hello.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
