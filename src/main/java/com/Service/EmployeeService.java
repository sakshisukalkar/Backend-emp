package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Employee;
import com.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository eresp;

	//save
		public String save(Employee e)
		{
			eresp.save(e);
			return "employee record added successfully";
		}
		//find all
		public List<Employee>findallemp()
		{
			return eresp.findAll();
		}

		//deletebyid
		public String deletebyid(int empid)
		{
			Employee existingemp=eresp.findById(empid).orElse(null);
			if(existingemp==null)
			{
				return "no record found for delete operation";
			}
			else
			{
				eresp.deleteById(empid);
				return"record deleted success fully";
			}
		}
		public String updatebyid(int empid,Employee newemp)
		{
			  Employee existingemp=eresp.findById(empid) .orElse(null);
			  if(existingemp==null)
			  {
				  return "No record found for given empid";
			  }
			  if(newemp.getFirstname()==null&&newemp.getLastname()==null&&
					  newemp.getGender()==null
					  &&newemp.getEmail()==null&&newemp.getContactno()==0&&
					  newemp.getAdharcardno()==0
					  &&newemp.getDepartment()==null&&newemp.getDesignation()==null
					  &&newemp.getDob()==null&&newemp.getJoiningdate()==null
					  &&newemp.getPanno()==null&&newemp.getExp()==0&&newemp.getImg()==null
					  &&newemp.getReportingauthority()==null&&newemp.getSalary()==0.0)
				  
			  {
				  return "No new record provided for updation";
			  }
			  if(newemp.getFirstname()!=null)
			  {
				  existingemp.setFirstname(newemp.getFirstname());
			  }
			  if(newemp.getLastname()!=null)
			  {
				  existingemp.setLastname(newemp.getLastname());
			  }
			  if(newemp.getGender()!=null)
			  {
				  existingemp.setGender(newemp.getGender());
			  }
			  if(newemp.getEmail()!=null)
			  {
				  existingemp.setEmail(newemp.getEmail());
			  }
			  if(newemp.getContactno()!=0)
			  {
				  existingemp.setContactno(newemp.getContactno());
			  }
			  if(newemp.getDepartment()!=null)
			  {
				  existingemp.setDepartment(newemp.getDepartment());
			  }
			  if(newemp.getDesignation()!=null)
			  {
				  existingemp.setDesignation(newemp.getDesignation());
			  }
			  if(newemp.getAdharcardno()!=0)
			  {
				  existingemp.setAdharcardno(newemp.getAdharcardno());
			  }
			  if(newemp.getPanno()!=null)
			  {
				  existingemp.setPanno(newemp.getPanno());;
			  }
			  if(newemp.getDob()!=null)
			  {
				  existingemp.setDob(newemp.getDob());
			  }
			  if(newemp.getJoiningdate()!=null)
			  {
				  existingemp.setJoiningdate(newemp.getJoiningdate());
			  }
			  if(newemp.getExp()!=0)
			  {
				  existingemp.setExp(newemp.getExp());
			  }
			  if(newemp.getReportingauthority()!=null)
			  {
				  existingemp.setReposrtingauthority(null);
			  }
			  if(newemp.getImg()!=null)
			  {
				  existingemp.setImg(newemp.getImg());
			  }
			  if(newemp.getSalary()!=0.0)
			  {
				  existingemp.setSalary(newemp.getSalary());
			  }
			  
			  eresp.save(existingemp);
			  return "Employee record updated sucessfully";
		}
		public Employee findbyid(int empid)
		{
			return eresp.findById(empid).orElse(null);
		}
		public List<Employee>findbyfirstname(String firstname)
		{
			return eresp.findByFirstname(firstname);
		}
		public List<Employee>findbylastname(String lastname)
		{
			return eresp.findByLastname(lastname);
		}
		public List<Employee>findbyDesignation(String designation)
		{
			return eresp.findByDesignation(designation);
		}
		public List<Employee>findbydepartment(String department)
		{
			return eresp.findByDepartment(department);
		}

	
}
