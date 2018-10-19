/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.ct417_1;

/**
 *
 * @author David Williams
 */
public class Student {
  	String firstName;
	String lastName;
	String DOB;
	int age;
	String userName;
	int ID;
	String modulesRegistered;


public Student(String fName, String lName, String dob, int Age, int id, String modules){
	firstName = fName;
	lastName = lName;
	DOB = dob;
	age = Age;
	ID = id;
	modulesRegistered = modules;
	this.getUserName();
}

public String getName(){
	String Name = firstName + " " + lastName;
	return Name;
}

public String getUserName(){
	userName = firstName + lastName + age;
	return userName;
}  
}
