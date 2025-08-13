package br.com.topper.adapters.out;

import br.com.topper.domain.Team;
import br.com.topper.domain.ports.TeamRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class TeamRepositoryAdapter implements TeamRepositoryPort {

    private final TeamJpaRepository teamJpaRepository;

    public TeamRepositoryAdapter(TeamJpaRepository teamJpaRepository) {
        this.teamJpaRepository = teamJpaRepository;
    }

    @Override
    public Team save(Team team) {
        TeamEntity teamEntity = toEntity(team);
        TeamEntity savedEntity = teamJpaRepository.save(teamEntity);

        return toDomain(savedEntity);
    }

    private TeamEntity toEntity(Team team) {
        return new TeamEntity(team.getName(), team.getOwnerName(), team.getTeamValue());
    }

    private Team toDomain(TeamEntity entity) {
        return new Team(entity.getId(), entity.getName(), entity.getOwnerName(), entity.getTeamValue());
    }
}
