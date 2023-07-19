package org.jsp1.configurationOfxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application1 
{
    public static void main(String[] args) 
    {
        // Ioc container
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        // Access the employee bean by its ID (correct the case sensitivity)
        //to this is emp0 is defalut constructor and defalut values are printed
       // employee emp0 = (employee) context.getBean("emp0");
        
        employee emp1 = (employee) context.getBean("emp1");
        System.out.println(emp1);
        System.out.println(" ");
        // Since the bean has a prototype scope, calling getBean multiple times will create new instances
       
        employee emp2 = (employee) context.getBean("emp2");
        System.out.println("Employee 2: " + emp2);
        System.out.println(" ");
        employee emp3 = (employee) context.getBean("emp3");
        System.out.println("Employee 3: " + emp3);
        System.out.println(" ");
        employee emp4 = (employee) context.getBean("emp4");
        System.out.println("Employee 4: " + emp4);
        System.out.println(" ");
        employee emp5 = (employee) context.getBean("emp5");
        System.out.println("Employee 5: " + emp5);
        System.out.println(" ");
        employee emp6 = (employee) context.getBean("emp6");
        System.out.println("Employee 6: " + emp6);
        System.out.println(" ");
        employee emp7 = (employee) context.getBean("emp7");
        System.out.println("Employee 7: " + emp7);
        // Spring will create a new instance of the employee each time you request the bean
        // You should see the constructor messages printed in the console for each instance created.
    }
}
