package com.example.demo.person;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence" //Bezieht sich auf den SequenceGenerator davor
    )
    @Getter private Long id;
    @Getter private String vorname;
    @Getter private String nachname;
    @Getter private String email;
    @Getter private List<String> hobbys;

    public Person(String vorname, String nachname, String email, List<String> hobbys) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.hobbys = hobbys;
    }
}
