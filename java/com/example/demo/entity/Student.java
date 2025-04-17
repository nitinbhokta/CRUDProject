package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int Coursefee;
	private int semester;
	
	public Student() {
		
	}
	
	public Student(String name, int coursefee, int semester) {
		super();
		this.name = name;
		Coursefee = coursefee;
		this.semester = semester;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoursefee() {
		return Coursefee;
	}

	public void setCoursefee(int coursefee) {
		Coursefee = coursefee;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Coursefee=" + Coursefee + ", semester=" + semester + "]";
	}
	
	

	
}
