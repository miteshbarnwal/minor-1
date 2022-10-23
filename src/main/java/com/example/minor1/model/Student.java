package com.example.minor1.model;


import lombok.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true, nullable = false)
    //We want our contact to be unique only, It can't be null.
    //unique parameter is present in @Column annotation
    //Because of country code we took contact as string
    private String contact;

    private String address;

    @Column(unique = true)
    //We dont want duplicate data in email Id.It can be null but cant have duplicate value.
    private String email;

    @Enumerated(value=EnumType.STRING)
    private AccountStatus accountStatus;

    @CreationTimestamp
    // It is important to have data related to When the student was created i.e. at what date and time
    private Date createdOn;

    @UpdateTimestamp
    //On which date the student information was updated.
    private Date updatedOn;


    @OneToMany(mappedBy = "student")
    //One student can have multiple books or a list of books.
    List<Book> bookList;
    //Nothing related to bookList will be present in Student table.

//    @OneToMany(mappedBy = "my_student")
    //One student can have many transaction

    @OneToMany(mappedBy = "my_student")
    private List<Transaction> transactionList;

}
