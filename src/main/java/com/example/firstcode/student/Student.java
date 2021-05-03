package com.example.firstcode.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "studentdata")
public class Student {
	
	@Id
	// @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence",allocationSize=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="student_sequence")
	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	@Transient
	private Integer age;
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = Period.between(this.dob, LocalDate.now()).getYears();
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}




	

}
