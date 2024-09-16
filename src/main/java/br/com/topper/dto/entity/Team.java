package br.com.topper.dto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@ToString
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String ownerName;
    private Double teamValue;

    public Team() {}

    public Team(String name, String ownerName, Double teamValue) {
        this.name = name;
        this.ownerName = ownerName;
        this.teamValue = teamValue;
    }

}
