package com.example.ipabasicmay1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired StudentRepository studentRepository;
    @Autowired LibraryCardRepository libraryCardRepository;
    public void addCard(LibraryCard card) throws Exception {
//        try{//where the student exist or not show try catch kie hai
//            Student student = studentRepository.findById(card.getStudent().getStudentId()).get();
//            card.setStudent(student);
//        }
//        catch (Exception e){
//            throw new Exception("Student does not exist");
//        }
    }
}
