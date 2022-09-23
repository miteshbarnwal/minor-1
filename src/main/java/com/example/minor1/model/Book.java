package com.example.minor1.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int cost;

    @Enumerated(value=EnumType.STRING)
    private Genre genre;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    //In Book class we have student object.
    @ManyToOne
    //Many books can be issued by one student so @ManyToOne annotation coming.
    @JoinColumn
    //student Id is a foreign key in Book Table.
    private Student student;



//    private Student tempStudent;
    //How hibernate will understand whether to query student or tempStudent.

    // select * from Student where student_id = ?
    // select * from Book where student_id = ?
}
