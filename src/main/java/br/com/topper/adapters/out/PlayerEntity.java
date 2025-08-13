package br.com.topper.adapters.out;

import br.com.topper.domain.enums.JogadorStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private JogadorStatus status;
    private Double price;
    private String club;
    private String position;
    private Boolean isBrought;


}
