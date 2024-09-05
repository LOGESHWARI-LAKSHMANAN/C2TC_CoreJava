package day2;

class Employee{
	int empid;
	int emp_salary;
	
public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	
@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emp_salary=" + emp_salary + ", getEmpid()=" + getEmpid()
				+ ", getEmp_salary()=" + getEmp_salary() + "]";
	}

public class encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		 e.setempid (1);
		 e.setemp_salary(30);

		 // Using methods to get the values from the
		 // variables
		 System.out.println("Name: " + e.getempid());
		 System.out.println("Age: " + e.getemp_salary());
		}
	}
/*
//Java Program to demonstrate
//Java Encapsulation

//Person Class
class Person {
// Encapsulating the name and age
// only approachable and used using
// methods defined
private String name;
private int age;

public String getName() { return name; }

public void setName(String name) { this.name = name; }

public int getAge() { return age; }

public void setAge(int age) { this.age = age; }
}

//Driver Class
public class encapsulation {
// main function
public static void main(String[] args)
{
 // person object created
 Person person = new Person();
 person.setName("John");
 person.setAge(30);

 // Using methods to get the values from the
 // variables
 System.out.println("Name: " + person.getName());
 System.out.println("Age: " + person.getAge());
}
}*/


