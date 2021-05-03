package com.example.firstcode.student;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository 
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query(value = "SELECT * from studentdata where s.email=?1", nativeQuery=true)
	Student findStudentByEmail(String email);
	
	// update studentdata set name='sr' where id = '2';
	@Transactional
	@Modifying
	@Query(value = "UPDATE studentdata s set s.name=?2,s.email=?3 where s.id=?1", nativeQuery=true)
	void updateStudent(int studentId, String name,String email);
	
}
