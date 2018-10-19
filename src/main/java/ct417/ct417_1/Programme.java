/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.ct417_1;

import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;

/**
 *
 * @author David Williams
 */
public class Programme {
	String ProgramName;
	ArrayList<Module> modules = new ArrayList<Module>();
        DateTime dt = new DateTime();
	DateTime start;
	DateTime end;
	
	public Programme(String name, DateTime Start, DateTime End){
		ProgramName = name;
		start = Start;
		end = End;
	}
	
	public void addModule(Module mod){
		modules.add(mod);
	}
}
