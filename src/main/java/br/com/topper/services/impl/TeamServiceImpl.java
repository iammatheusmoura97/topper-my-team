package br.com.topper.services.impl;

import br.com.topper.dto.entity.Team;
import br.com.topper.dto.response.TeamResponseDTO;
import br.com.topper.repository.TeamRepository;
import br.com.topper.services.TeamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public TeamResponseDTO createTeam(String nome, String nomeDonoTime) {
        Team team = new Team(nome, nomeDonoTime, 100.0);

        try {
            teamRepository.save(team);
        } catch(Exception e) {
            log.error("Erro ao salvar time no banco de dados", e);
            throw new RuntimeException("Erro ao salvar time no banco de dados");
        }


        return TeamResponseDTO.builder()
                .nomeTeam(team.getName())
                .nomeDonoTime(team.getOwnerName())
                .patrimonio(team.getTeamValue())
                .build();
    }
}
