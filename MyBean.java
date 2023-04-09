package net.codejava.swing;

import java.awt.*;
import java.beans.*;

public class MyBean {
	private String name;
	
	public MyBean() {
		name="Default";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

}
