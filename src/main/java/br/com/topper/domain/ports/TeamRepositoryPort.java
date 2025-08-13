package br.com.topper.domain.ports;

import br.com.topper.domain.Team;

public interface TeamRepositoryPort {

    Team save(Team team);
}
