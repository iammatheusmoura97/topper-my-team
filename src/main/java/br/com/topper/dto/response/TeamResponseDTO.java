package br.com.topper.dto.response;

import lombok.Builder;

@Builder
public class TeamResponseDTO {

    private String nomeTeam;
    private String nomeDonoTime;
    private Double patrimonio;

    public TeamResponseDTO(String nomeTeam, String nomeDonoTime, Double patrimonio) {
        this.nomeTeam = nomeTeam;
        this.nomeDonoTime = nomeDonoTime;
        this.patrimonio = patrimonio;
    }
}
