package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setXscale(0,28);
		StdDraw.setYscale(0,22);
		StdDraw.setPenColor(0,0,0);
	    StdDraw.rectangle(14,11,13,8.5);
	    
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(150,123,182);
	    StdDraw.filledRectangle(11,5,10,3);
	    StdDraw.setPenColor(31,78,47);
	    StdDraw.filledRectangle(11,11,10,3);
	}
}