package com.project.staticCodeAnalysis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
public class TestModel {
	
	@Id
	@GeneratedValue
	int id;
	
	String Name;
	String School;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
}
