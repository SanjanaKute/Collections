package core.java.collectionsAssignment;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Employee1
{
	int iD;
	String name;
	String department;
	int salary;
	
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Employee1(int iD, String name, String department, int salary) {
		super();
		this.iD = iD;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee1 [iD=" + iD + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
class Id implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
			if(e1.getiD()>e2.getiD())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	
}
class Name implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
	
}
class Department implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
class Salary implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class MainClass3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select any option: ");
		System.out.println("1.ID\t 2.Name\t 3.Department\t 4.Salary");
		int select=sc.nextInt();
		
		TreeSet<Employee1> e=null;
		switch(select)
		{
		case 1: e=new TreeSet<>(new Id());
		break;
		
		case 2:e=new TreeSet<>(new Name());
		break;
		
		case 3:e=new TreeSet<>(new Department());
		break;
		
		case 4:e=new TreeSet<>(new Salary());
		break;
		}
		e.add(new Employee1(1,"Shawn","IT",21000));
		e.add(new Employee1(2,"Richel","Marketing",20000));
		e.add(new Employee1(3,"John","Finance",50000));
		e.add(new Employee1(4,"Mike","Training",1900));
		e.add(new Employee1(5,"Ben","BU",2100));
		e.add(new Employee1(6,"Hynes","HR",2400));
		e.add(new Employee1(7,"Danyl","Marketing",2000));
		e.add(new Employee1(8,"Ryan","Management",2300));
		e.add(new Employee1(9,"Jack","BU",1900));
		e.add(new Employee1(10,"Jill","Analyst",1700));
		
		for(Employee1 e1:e)
		{
			System.out.println(e1);
		}
		
	}

}
