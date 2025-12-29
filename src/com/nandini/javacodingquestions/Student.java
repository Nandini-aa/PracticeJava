package com.nandini.javacodingquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
	
	private int id; 
	private String name;
	private double marks;
	

	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
	 return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public double getMarks() {
        return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(this.id, o.id); 
		//return this.id.compareTo(o.id);  //because it takes wrapper class if incase to use compareTO
	}
	
	
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
	
		list.add(new Student(108 ,"nandini", 80));
		list.add(new Student(101 ,"maheshbabu", 99));	
		list.add(new Student(111,"pandu", 85));
		list.add(new Student(109 ,"bhavani", 81));
		list.add(new Student(109 ,"vinnu", 86));
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sorting by id : "+ list);
		
		Collections.sort(list, new NameComparator());
		System.out.println("custom Sorting by name" + list);
		
		
		//instead of writing separator comparator classes we can use comparator chaining
		
		//Within the same id group (like if you had two students with id=109), the marks decide the order.
		
		list.sort(Comparator.comparingInt(Student::getId)  //sort id
				.thenComparingDouble(Student::getMarks).reversed()
				.thenComparing(Student::getName)
				);
		System.out.println("Sorted by id, then marks, then name:" +list);
	}

	
}
