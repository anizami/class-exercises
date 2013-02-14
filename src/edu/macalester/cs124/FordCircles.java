package edu.macalester.cs124;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;

public class FordCircles extends GraphicsProgram{
	
	public void run() {
		drawCircle(1, 2);
		drawCircle(2,2);
					
			
				
	}
	

	
	public void drawCircle(double p, double q) { 
		double radius = 1 / (2*q*q);
		double x = p / q;
		x = x - radius;
		double y = 0;
		double width = getWidth();
		GOval circle1 = new GOval(width*x, y, width*radius, width*radius);
		add(circle1);
	}
	
	


	
}
