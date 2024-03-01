package ObejectByUsingNewInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Sahil{
	
	
	public void dis() {
		System.out.println("This is by using new instance");
	}
	
}

public class Student {

	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		Constructor<Sahil> u ;
		
		u = Sahil.class.getDeclaredConstructor();
		
		Sahil sahil = u.newInstance();
		
		sahil.dis();
		
	}
	
}
