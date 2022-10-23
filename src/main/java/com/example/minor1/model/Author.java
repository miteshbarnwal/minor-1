package com.example.minor1.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int age;

//    @Column(name="land")
    private String country;

    @OneToMany(mappedBy = "author")
    private List<Book> bookList;

    @CreationTimestamp
    private Date createdOn;

    //One author can write many different books.
    //There can be two authors with same name,same age and same country as well.
    //We will add emailId, it will be unique for each author.

//    @Column(unique=true,nullable=false)
//    private String email;
}
