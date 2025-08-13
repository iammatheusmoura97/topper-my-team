package br.com.topper.domain;

import br.com.topper.domain.enums.JogadorStatus;

public class Player {
    private Long id;
    private String name;
    private JogadorStatus status;
    private Double price;
    private String club;
    private String position;
    private Boolean isBrought;

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

    public JogadorStatus getStatus() {
        return status;
    }

    public void setStatus(JogadorStatus status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getBrought() {
        return isBrought;
    }

    public void setBrought(Boolean brought) {
        isBrought = brought;
    }
}
