package com.venkat.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkat.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
