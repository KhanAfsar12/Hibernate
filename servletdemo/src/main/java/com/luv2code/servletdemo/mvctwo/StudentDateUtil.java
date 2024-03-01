package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDateUtil {

	public static List<Student1> getStudent1(){
		List<Student1> std = new ArrayList<>();
		std.add(new Student1("Afsar","Khan", "ka484564@gmail.com"));
		std.add(new Student1("Izhar","Khan", "ki484564@gmail.com"));
		std.add(new Student1("Arshad","Ansari", "aa484564@gmail.com"));
		std.add(new Student1("Sahil","Siddique", "ss484564@gmail.com"));
		return std;
	}
}
