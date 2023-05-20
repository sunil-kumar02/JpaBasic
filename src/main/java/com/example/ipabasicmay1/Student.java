package com.example.ipabasicmay1;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_info") //changing name of table from student to student_info now drop student table.
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private int age;

   @Column(name = "full_name")
    private String name;

    private int marks;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard libraryCard;
}
