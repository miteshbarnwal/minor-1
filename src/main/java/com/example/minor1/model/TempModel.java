package com.example.minor1.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TempModel implements Serializable {
    //We want to make id and name as a primary key.
    @Id
    private int id;

    @Id
    private String name;

    @CreationTimestamp
    private Date createdOn;
}
