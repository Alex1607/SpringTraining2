package com.example.demo.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository
        extends JpaRepository<Person, Long> { //Long weil das der Type der ID ist in der Person klasse

    @Query("SELECT s FROM Person s WHERE s.email = ?1") //Kein SQL! Person in diesem fall muss wie die Klasse heißen
                                                        //Scheinbar nicht notwendig?
    Optional<Person> findPersonByEmail(String email);

}
