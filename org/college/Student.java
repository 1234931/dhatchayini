package org.college;

public class Student extends Department{
	
public void studentname() {
	System.out.println("student name is Dhatch");

}
public void studentdept() {
	System.out.println("deptmnt is CSE");

}
public void studentid() {
	System.out.println("id is 08ISR008");

}

public static void main(String[] args) {
	Student detail = new Student();
	detail.collegename();
}	
}