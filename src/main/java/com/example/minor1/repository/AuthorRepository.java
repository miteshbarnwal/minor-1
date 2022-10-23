package com.example.minor1.repository;

import com.example.minor1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {

    /*
        3 ways to write a custom function for custom query.
            1] Native Query.
            2] JPQL ==> It means Java Persistence Query Language
            3] Do not have to write the query.
     */
//Using Native
    //Using Argument name
//    @Query("select a from author a where a.email = :my_email");
//    //parameter passed in fns will be on R.H.S. of equals with a colon.
//    Author getAuthorByGivenEmailIdNative(String my_email);
    //Whatever email is coming from the frontend,we will pass that as a parameter in the fns and with that emailId it will search in the author table.

    //Using argument Index


//    @Query(value = "select * from author a where a.email = ?1",nativeQuery = true)
//    Author getAuthorByGivenEmailIdNative2(String my_email);
//
////Using JPQL
//
//    @Query("select a from Author a where a.email = ?1")
//    Author getAuthorByGivenEmailIdJPQL(String authorEmail);
//
//    @Query(value = "select a from author a where a.land = ?1", nativeQuery = true)
//    List<Author> getAuthorsByCountry(String country);
//
//    @Query(value = "select a from Author a where a.country = ?1")
//    List<Author> getAuthorsByCountryJPQL(String country);
}
