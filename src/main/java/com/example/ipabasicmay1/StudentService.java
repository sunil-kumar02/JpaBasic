package com.example.ipabasicmay1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired StudentRepository studentRepository;
    @Autowired LibraryCardRepository cardRepository;
    public String addStudent(Student student, Department department){//create object set the parameters
        LibraryCard card = new LibraryCard();
        card.setDepartment(department);
        card.setStudent(student);
        student.setLibraryCard(card);
        studentRepository.save(student);
        return "student added successfully";
    }

    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId).get();

    }

    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "student deleted successfully";
    }

    public List<String> getAllByAge(int age) {
        List<Student> students = studentRepository.findByAge(age);
        List<String>name = new ArrayList<>();
        for(Student student : students)name.add(student.getName());
        return name;
    }
    public List<String>getAllByAgeAndMarks(int age,int marks){
        List<Student> student = studentRepository.findByAgeAndMarks(age,marks);
        List<String>name = new ArrayList<>();
        for(Student student1: student)name.add(student1.getName());
        return name;

    }

    public List<String>getAllByAgeGreaterThen(int age){
        List<Student> students = studentRepository.findAllByAgeGreaterThen(age);
        List<String>name = new ArrayList<>();
        for(Student student:students)name.add(student.getName());
        return name;
    }
}
