package com.example.ITJOB.Model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @NotEmpty
    @Size(min = 3,max = 10,message = "veuillez respecter le model suivant")
    private String Nom;

    @Email
    @NotEmpty
    private String emailentreprise;



}
