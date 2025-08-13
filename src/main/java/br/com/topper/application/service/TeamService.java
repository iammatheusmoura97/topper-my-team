package br.com.topper.application.service;

import br.com.topper.domain.Team;
import br.com.topper.domain.ports.TeamRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepositoryPort teamRepositoryPort;

    public TeamService(TeamRepositoryPort teamRepositoryPort) {
        this.teamRepositoryPort = teamRepositoryPort;
    }

    public Team createTeam(Team team) {
        return teamRepositoryPort.save(team);
    }

}
