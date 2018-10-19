/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.ct417_1;
import org.joda.time.DateTime;
/**
 *
 * @author David Williams
 */
public class Reg_System{
    public Reg_System(){
    }
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe","16/5/1998", 20, 1234567, "CT417,EE451");
        Student student2 = new Student("Jane", "Doe","17/1/1997", 21, 7654321, "CT417");

        Module CT417 = new Module("Software Engineering 3", "CT417", "ECE, CS&IT");
        Module EE451 = new Module("System on Chips Design", "EE451", "ECE");

        DateTime start = new DateTime(2018,9,1,0,0,0);
        //2018,9,1
        DateTime end = new DateTime(2019,5,1,0,0,0,0);
        //2019,5,1

        Programme ECE = new Programme("ECE", start, end);
        Programme CSIT = new Programme("CS&IT", start, end);

        CT417.addStudent(student1);
        CT417.addStudent(student2);
        EE451.addStudent(student1);

        ECE.addModule(CT417);
        ECE.addModule(EE451);
        CSIT.addModule(CT417);
        }
}

