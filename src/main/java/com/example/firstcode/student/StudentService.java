package com.example.firstcode.student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudent(){
		return studentRepository.findAll();
	}


	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub
		// Student studentOptional=studentRepository.findStudentByEmail(student.getEmail());
//		if(studentOptional.isPresent()) {
//			throw new IllegalStateException("Email taken");
//		}
		// student.setAge(30);
		System.out.println("Student: " + student);
		studentRepository.save(student);

	}

	public void deleteStudents(int studentId) {
		boolean exists= studentRepository.existsById(studentId);
		if(!exists) {
			throw new IllegalStateException(
					"Student with id"+ studentId +"does not exist"
					);
		
		}
		studentRepository.deleteById(studentId);
		
		
		
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void updateStudent(int studentId, String name, String email) {
//		Student student =studentRepository.findById(studentId)
//				.orElseThrow(()->new IllegalStateException(
//						"Student with id"+ studentId +"does not exist"));
//		if(name!=null && 
//				name.length()>0 && 
//				!Objects.equals(student.getName(),name)) {
//			student.setName(name);
//		}
//		if(email!= null &&
//				email.length()>0 &&
//				!Objects.equals(student.getEmail(),email)) {
//			Optional<Student> studentOptional= studentRepository.findStudentByEmail(email);
//			if(studentOptional.isPresent()) {
//				throw new IllegalStateException("Email taken");
//			}te
//			student.setEmail(email);
//		}
		
		boolean exist =studentRepository.existsById(studentId);
		if(!exist) {
			throw new IllegalStateException("idnot exits"+studentId);
		}
		
		studentRepository.updateStudent(studentId, name,email);
		
		
		// System.out.println("Response: " + response);
	}
}