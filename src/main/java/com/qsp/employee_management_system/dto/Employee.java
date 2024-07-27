package com.qsp.employee_management_system.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="Employee_info")
public class Employee 
{
 
	@Id
	@Column(name="employeeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="employeeName")
//	@NotNull(message = "chutiye naam daal")
//	@NotBlank(message = "blank kashyala thevto re")
	@NotEmpty(message = "Name can't be empty")
	private String name;
	
	@Column(name="employeePhone",unique = true)
	@Min(value = 6000000000L)
	@Max(value = 9999999999L)
	private long phone;
	
	@Column(name="employeeAddress")
	private String address;
	
	@Column(name="employeeEmail",unique = true)
	@NotEmpty(message = "Email can't be empty")
	@Email(regexp = "[a-z0-9._$]+@[a-z]+\\.[a-z]{2,3}", message = "Enter proper email"
			+ "")
	private String email;
	
	@Column(name="employeePassword")
	private String password;
	
	@Column(name="employeeSalary")
	private double salary;
	
	@Column(name="employeeDesignation")
	private String designation;

	@Column(name = "employeeGrade")
	private char grade;



	
	
}

