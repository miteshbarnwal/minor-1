package com.example.minor1.service;

import com.example.minor1.model.Author;
import com.example.minor1.model.Book;
import com.example.minor1.repository.AuthorRepository;
import com.example.minor1.repository.BookRepository;
import com.example.minor1.request.BookCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public void create(BookCreateRequest bookCreateRequest) {
        Book book=bookCreateRequest.to();

        Author author = book.getAuthor();
        // Find if author with given email id present in DB or not.
        // if present we will directly store book object.
        // otherwise we will first store author and then store book object.

        Author authorFromDB = authorRepository.save(author);

//        Author authorFromDB = authorRepository.getAuthorByGivenEmailIdNative2(author.getEmail());

//        if(authorFromDB == null){
//            authorFromDB = authorRepository.save(author);
//        }

//        Author authorFromDB= authorRepository.save(author);
        //Above save fns will save author into the database.
        //We have the author which is saved in the database.
        //We have to assign that author into the object which we want to store in the book table ie the book object
        book.setAuthor(authorFromDB);
//       Author author = book.getAuthor();
        author.setId(1);



        //Whatever author we are creating,that author we will assign to below author.
        //After assigning to it, we will set the authorId to 1
//        Author author=book.getAuthor();
//        //We are setting the Id of author to 1.
//        //We are getting the author object of book itself.After that we are modifying the id of received author.
//        author.setId(1);
        bookRepository.save(book);


    }
}
