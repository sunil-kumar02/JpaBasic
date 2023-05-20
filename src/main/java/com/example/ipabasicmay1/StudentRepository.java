package com.example.ipabasicmay1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Integer> {
    List<Student> findByAge(int age);

    List<Student> findByAgeAndMarks(int age,int marks);
    @Query(value = "select s from Student s where s.age > :age",nativeQuery = false)

    List<Student> findAllByAgeGreaterThen(int age);
    //if we make studentrepository class then we have to implements all the function but now it will ectends show
    //we make interface,student and datatypes of primary key


}
