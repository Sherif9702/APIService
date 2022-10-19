package com.cherif.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
//@Data est une annotation Lombok. Nul besoin d’ajouter les getters et les setters.
// La librairie Lombok s’en charge pour nous. Très utile pour alléger le code.
@Entity // la classe est une table de ma BDD
@Table(name = "employees") //nom de la tabble
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String mail;

    private String password;

}
