package com.st.spring.beans;

import com.st.spring.interfaces.Ink;
import com.st.spring.interfaces.Pen;

public class FountainPen implements Pen {

	private Ink ink;

	public FountainPen(Ink ink) {
	   this.ink=ink;	
	}

	public void write() {
	System.out.println("Writing with" +ink.getbrandName()+"Pen of "+ink.getbrandColor());		
	}

}
