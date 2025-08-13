package br.com.topper.adapters.out;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String ownerName;
    private Double teamValue;

    public TeamEntity() {}

    public TeamEntity(String name, String ownerName, Double teamValue) {
        this.name = name;
        this.ownerName = ownerName;
        this.teamValue = teamValue;
    }
}
