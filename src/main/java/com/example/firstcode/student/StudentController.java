package com.example.firstcode.student;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="student/data")

public class StudentController {
	
	private final StudentService studentservice;
	
	@Autowired
	/*@Autowired is used to interface StudentService by instantiating the object studentservice;
	 * 
	 */
	public StudentController(StudentService studentservice) {
		
		this.studentservice = studentservice;
	}

	@GetMapping
	public List<Student> getStudent(){
		/*List<Student> students=new ArrayList<>();
		students=studentservice.getStudent();
		
		return students;
		*/
		return studentservice.getStudent();
	}
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void registerNewStudent(@RequestBody Student student) {
		studentservice.addNewStudent(student);
	}
	@DeleteMapping(path = "{studentId}")
	public void deleteStudent(@PathVariable("studentId") int studentId) {
		studentservice.deleteStudents(studentId);
	}
	
//	@PutMapping(path="{studentId}")
//	public void updateStudent(
//			@PathVariable("studentId") Long studentID,
//			@RequestParam(required = false) String name,
//			@RequestParam(required = false) String email
//			) {
//		studentservice.updateStudent(studentID,name,email);
//	}
	
//	@PutMapping(path="{studentId}",consumes=MediaType.APPLICATION_JSON_VALUE)
//	public void updateStudent(@PathVariable("studentId") Long studentID,
//			@RequestParam(required = false) String name,
//			@RequestParam(required = false) String email) {
//		studentservice.updateStudent(studentID,name,email);
//		System.out.println("Student ID: " + studentID);
//		System.out.println("Name: " + name);
//		
//	}
	
	@PutMapping(path="/updatestudent",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student) {
		System.out.println("Student Object: " + student);
		studentservice.updateStudent(student.getId(), student.getName(), student.getEmail());
		
	}
	
}
	

