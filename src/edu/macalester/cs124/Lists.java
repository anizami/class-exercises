package edu.macalester.cs124;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import acm.program.ConsoleProgram;

public class Lists extends ConsoleProgram {
	
	public void run() {
		setFont(new Font("Menlo", Font.PLAIN, 24));
		
		List<String> things = new ArrayList<String>();
		things.add("shoes");
		things.add("hats");
		things.add("belts");
		things.add("coats");
		things.add("happy");
		things.add("mole");
		things.add("bat");
		things.add("animal");
		
		
		List<String> reversed = new ArrayList<String>();
		
		int listsize = things.size();
		int n = listsize -1;
		
		for (int i=n; i > -1; i--) {
				String a = things.get(i);
				reversed.add(a);	
		}	
		
		println(reversed);
	}
	

}
