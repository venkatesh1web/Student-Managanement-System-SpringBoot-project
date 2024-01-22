package com.venkat.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.venkat.sms.entity.Student;
import com.venkat.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Venkatesh","Avala","venkatesh@gamil.com"); 
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sai","Vavili","sai@gamil.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Venkat","A","venkat@gamil.com");
//		studentRepository.save(student3);
//		
	}

}
