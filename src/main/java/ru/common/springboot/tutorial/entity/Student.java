package ru.common.springboot.tutorial.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	@Size(min = 2, max = 30, message = "Имя должно содержать от 2 до 30 символов")
	private String name;

	@Column(name = "last_name")
	@Size(min = 2, max = 30, message = "Фамилия должна содержать от 2 до 30 символов")
	private String lastName;

	@Column(name = "email")
	@Email(message = "Invalid email! Please enter valid email")
	private String email;

	@Column(name = "phone_no")
	private String phoneNo;

	public Student()
	{
		super();
	}

	public Student(String name, String email)
	{
		super();
		this.name = name;
		this.email = email;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhoneNo()
	{
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}

	public String getLastName() { return lastName; }

	public void setLastName(String lastName) { this.lastName = lastName; }
}
