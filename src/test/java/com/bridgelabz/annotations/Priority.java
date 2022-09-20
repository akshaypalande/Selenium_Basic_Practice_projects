package com.bridgelabz.annotations;

import org.testng.annotations.Test;

public class Priority {

	@Test  
	public void mango()  
	{  
	System.out.println("I am Akshay");  
	}  
	@Test(priority=2)  
	public void apple()  
	{  
	System.out.println("I am Sunny");  
	}  
	@Test  (priority=1) 
	public void watermelon()  
	{  
	System.out.println("I am Wazir");  
	}  
}
