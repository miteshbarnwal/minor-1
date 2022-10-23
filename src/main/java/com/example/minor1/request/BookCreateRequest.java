package com.example.minor1.request;

import com.example.minor1.model.Author;
import com.example.minor1.model.Book;
import com.example.minor1.model.Genre;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookCreateRequest {
    //BookCreateRequest is something which we will take from the Frontend.
    //So it will be similar to the book class only.

    @NotBlank
    //name cant be null as well as cant be blank.
    //It cant be an empty sting as well as cant be null also.
    private String name;

    @Positive
    //cost of the book can be positive only.
    private int cost;

    @NotNull
    //genre cant be null
    private Genre genre;

    @NotNull
    //Author cannot be null
    //Above validation is not at the database level but at the application level.
    //Author is an object.
    private Author author;

    //Reason for taking author in the BookCreateRequest

    //We are converting BookCreateRequest to a Book object.
    public Book to(){
        return Book.builder()
                .cost(this.cost)
                .genre(this.genre)
                .name(this.name)
                .author(this.author)
                .build();
    }
}
