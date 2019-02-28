package com.st.spring.beans;

import com.st.spring.interfaces.Pen;

public class Writer {

	private Pen pen;

	public Writer(Pen pen) {
		this.pen = pen;
	}

	public void writer() {
		pen.write();
	}

}
