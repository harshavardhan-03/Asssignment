package com.xworkz.markerinterface.serializable;
import java.io.*; 
import java.io.Serializable;  
//Class Student implements 
class Student implements Serializable{  
	
	int id;  
	String name;  
	public Student(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
}