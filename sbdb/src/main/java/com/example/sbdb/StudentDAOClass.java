package com.example.sbdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class StudentDAOClass implements StudentDAO {

	StudentRepository sr;
	
	@Autowired
	public StudentDAOClass(StudentRepository sr) {
		super();
		this.sr = sr;
	}

	@Override
	public void insertStudent(Student s) {
		sr.save(s);
	}
	

}
