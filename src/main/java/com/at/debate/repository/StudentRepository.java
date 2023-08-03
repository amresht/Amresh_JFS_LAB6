package com.at.debate.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.at.debate.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
}
