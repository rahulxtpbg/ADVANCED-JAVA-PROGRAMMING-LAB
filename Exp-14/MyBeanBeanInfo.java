package net.codejava.swing;

import java.beans.*;

public class MyBeanBeanInfo extends SimpleBeanInfo {
	public PropertyDescriptor[] getPropertyDescriptors() {
		try {
			PropertyDescriptor nameDescriptor=new PropertyDescriptor("name", MyBean.class);
			nameDescriptor.setDisplayName("name");
			return new PropertyDescriptor[] {nameDescriptor};
		}
		catch(IntrospectionException e) {
			e.printStackTrace();
			return null;
		}
	}
}
