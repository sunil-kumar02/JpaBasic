package com.example.ipabasicmay1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generation type is snum
    int id;
    @Enumerated(EnumType.STRING)
    private Department department;

    @CreationTimestamp   // to automatically assign creation date;
    private Date issueDate;

    @UpdateTimestamp  // automatically update the last date of operation
    private Date lastTransactionDate;

    @OneToOne
    @JoinColumn//to create the foreign key column on primary key of student
    Student student;
}
//Auto enum primary key become static and shared in tabes.
//identity primary key become variable and not shared in tables.