package com.Controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Employee;
import com.Service.EmployeeService;




@RestController
@CrossOrigin
public class EmployeeCotroller {
	@Autowired
	EmployeeService service;

	@PostMapping("/addemp")
	public String addemp(@RequestBody Employee e)
	{
		return service.save(e);
	}
	@GetMapping("/findallemp")
	public List<Employee>findallemp()
	{
		return service.findallemp();
	}
	@DeleteMapping("/deletebyid")
	public String deletebyid(@RequestParam int empid)
	{
		return service.deletebyid(empid);
	}
	@PutMapping("/updatebyid")
	public String updatebyid (@RequestParam int empid ,@RequestBody Employee newemp)
	{
		return service.updatebyid(empid, newemp);
	}
	
	@GetMapping("/findbyempid")
	public Employee findbyid( @RequestParam int empid)
	{
		return service.findbyid(empid);
	}
	@GetMapping("/findbyfirstname")
	public List<Employee>findbyfirstname(String firstname)
	{
		return service.findbyfirstname(firstname);
	}
	
	@GetMapping("/findbylastname")
	public List<Employee>findbylastname(String lastname)
	{
		return service.findbylastname(lastname);
	}
	@GetMapping("/findbydesignation")
	public List<Employee>findbyDesignation(String designation)
	{
		return service.findbyDesignation(designation);
	}
	@GetMapping("/findbydepartment")
	public List<Employee>findbydepartment(String department)
	{
		return service.findbydepartment(department);
	}

}
