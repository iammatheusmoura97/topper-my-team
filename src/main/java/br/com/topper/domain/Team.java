package br.com.topper.domain;

public class Team {

    private Long id;
    private String name;
    private String ownerName;
    private Double teamValue;

    public Team() {
    }

    public Team(String name, String ownerName, Double teamValue) {
        this.name = name;
        this.ownerName = ownerName;
        this.teamValue = teamValue;
    }

    public Team(Long id, String name, String ownerName, Double teamValue) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.teamValue = teamValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getTeamValue() {
        return teamValue;
    }

    public void setTeamValue(Double teamValue) {
        this.teamValue = teamValue;
    }
}
