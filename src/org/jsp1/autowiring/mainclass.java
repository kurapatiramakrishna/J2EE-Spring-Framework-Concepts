package org.jsp1.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass 
{
	 public static void main(String[] args) 
	 {
	        // Load the Spring application context from the XML configuration
	        ApplicationContext context = new ClassPathXmlApplicationContext("configu.xml");

	        // Retrieve the book1 bean from the Spring container
	        Book book1 = context.getBean("book1", Book.class);

	        // Display the book details, including the author details (which should be autowired)
	        System.out.println(book1);
	 }
}
