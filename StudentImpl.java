package com.xworkz.markerinterface.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class StudentImpl{  
	public static void main(String args[]){  
		try{   
			Student student1 =new Student(22,"Harsha");  
			
			//Write the object to the stream by creating a output stream  
			FileOutputStream fileOut=new FileOutputStream("Anu.txt");  
			ObjectOutputStream objOut=new ObjectOutputStream(fileOut);  
			objOut.writeObject(student1);
			 
			objOut.close();  //close the stream 
			System.out.println("Object successfully written to the file");  
			   
			//Create a stream to read the object  
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("Anu.txt"));  
			Student student2 = (Student)objIn.readObject();  
			//print the data of the deserialized object  
			System.out.println("Student details: ID = " + student2.id+" Name = "+student2.name);  
			//close the stream  
			objIn.close();  
   
		}
		catch(Exception e) {
			System.out.println(e);
		}  
	}  
}