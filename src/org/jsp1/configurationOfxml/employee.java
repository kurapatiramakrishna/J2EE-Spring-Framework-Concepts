package org.jsp1.configurationOfxml;

public class employee
{
	    private int eid;
	    private String ename;
	    private int esalary;
	    private String email;
	    private String password;
	    private long emobile;
	    private int edeptno;
	   public employee() {
		// TODO Auto-generated constructor stub
	}
	    public employee(int eid) {
	        super();
	        this.eid = eid;
	        System.out.println("Ioc container called constructor with 1 argument");
	        System.out.println("Object created...");
	        System.out.println("Variable initialized...");
	    }

	    public employee(int eid, String ename) {
	        super();
	        this.eid = eid;
	        this.ename = ename;
	        System.out.println("IoC container called constructor with 2 arguments");
	        System.out.println("Object created");
	    }
  public employee(int eid,String ename,int esalary) 
  {
	    super();
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		System.out.println("IoC container called constructor with  3 arguments");
		System.out.println("Object created");
    }
  public employee(int eid,String ename,int esalary,String email)
  {
	    super();
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.email=email;
		System.out.println("IoC container called constructor with 4  arguments");
		System.out.println("Object created");
  }
  public employee(int eid,String ename,int esalary,String email, String password)
      {
	    super();
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.email=email;
		this.password=password;
		System.out.println("IoC container called constructor with 5  arguments");
		System.out.println("Object created");

   }   
  public employee(int eid,String ename,int esalary,String email, String password,long emobile)
  {
    super();
	this.eid=eid;
	this.ename=ename;
	this.esalary=esalary;
	this.email=email;
	this.password=password;
	this.emobile=emobile;
	System.out.println("IoC container called constructor with 6  arguments");
	System.out.println("Object created");

    }   
  public employee(int eid,String ename,int esalary,String email, String password,long emobile, int edeptno)
  {
	  super();
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.email=email;
		this.password=password;
		this.emobile=emobile;
		this.edeptno=edeptno;
		System.out.println("IoC container called constructor with 7 arguments");
		System.out.println("Object created");
	
  }
  @Override
  public String toString() {
      return "employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", email=" + email
              + ", password=" + password + ", emobile=" + emobile + ", edeptno=" + edeptno + "]";
  }
}

