package com.example.ITJOB.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "offres")
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @NotEmpty
    @Size(min = 3,max = 10,message = "veuillez respecter le model suivant")
    private String poste;

    @NotEmpty
    @Size(min = 3,max = 100,message = "veuillez respecter le model suivant")
    private String Description;

    @NotEmpty
    @Size(min = 3,max = 100,message = "veuillez respecter le model suivant")
    private Double Salaire;




}
