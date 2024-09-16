package br.com.topper.services;

import br.com.topper.dto.response.TeamResponseDTO;

public interface TeamService {

    TeamResponseDTO createTeam(String nome, String nomeDonoTime);

}
