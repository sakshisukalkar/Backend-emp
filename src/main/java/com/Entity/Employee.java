package com.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empid;
	String firstname;
	String lastname;
	String email;
	String department;
	long contactno;
	String gender;
	String designation;
	LocalDate dob;
	LocalDate joiningdate;
	String reportingauthority;
	int exp;
	long adharcardno;
	String panno;
	double salary;
	String img;
	Employee() {
		super();
	}
//	Employee(int empid, String firstname, String lastname, String email, String department, long contactno,
//			String gender, String designation, LocalDate dob, LocalDate joiningdate, String reportingauthority,
//			int exp, long adharcardno, String panno, double salary, String img) {
//		super();
//		this.empid = empid;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.email = email;
//		this.department = department;
//		this.contactno = contactno;
//		this.gender = gender;
//		this.designation = designation;
//		this.dob = dob;
//		this.joiningdate = joiningdate;
//		this.reportingauthority = reportingauthority;
//		this.exp = exp;
//		this.adharcardno = adharcardno;
//		this.panno = panno;
//		this.salary = salary;
//		this.img = img;
//	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getReportingauthority() {
		return reportingauthority;
	}
	public void setReposrtingauthority(String reportingauthority) {
		this.reportingauthority = reportingauthority;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public long getAdharcardno() {
		return adharcardno;
	}
	public void setAdharcardno(long adharcardno) {
		this.adharcardno = adharcardno;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	

}
