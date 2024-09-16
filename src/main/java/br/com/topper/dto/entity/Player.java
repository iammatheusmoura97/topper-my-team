package br.com.topper.dto.entity;

import br.com.topper.dto.enums.StatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private StatusEnum status;
    private Double price;
    private String club;
    private String position;
    private Boolean isBrought;


}
