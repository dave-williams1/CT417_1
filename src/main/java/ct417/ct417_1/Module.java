/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.ct417_1;

import java.util.ArrayList;

/**
 *
 * @author David Williams
 */
public class Module {
	String name;
	String id;
	String assosciatedCourses;
	ArrayList<Student> students= new ArrayList<Student>();
	
	public Module(String Name, String ID, String Courses){
		name = Name;
		id = ID;
		assosciatedCourses = Courses;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}    
}
