package com.st.spring.beans;

import com.st.spring.interfaces.Ink;

public class BlackInk implements Ink {

	public String getbrandName() {
		return "Parker";
	}

	public String getbrandColor() {
		return "black";
	}
}