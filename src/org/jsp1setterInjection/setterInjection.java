package org.jsp1setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterInjection 
{
  public static void main(String[] args)
  {
	ApplicationContext context=new ClassPathXmlApplicationContext("confi.xml");
	 // Retrieve the Book bean from the context
    book book = (book) context.getBean("book");

    // Use the book properties
    System.out.println("Title: " + book.getTitle());
    System.out.println("Author: " + book.getAuthor());
  }
  
}
