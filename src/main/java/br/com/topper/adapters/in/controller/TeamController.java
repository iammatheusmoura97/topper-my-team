package br.com.topper.adapters.in.controller;

import br.com.topper.adapters.in.request.TeamRequestDTO;
import br.com.topper.adapters.in.response.TeamResponseDTO;
import br.com.topper.application.service.TeamService;
import br.com.topper.domain.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<TeamResponseDTO> createTeam(@RequestBody TeamRequestDTO teamRequestDTO) {
        Team team = new Team(teamRequestDTO.getNome(), teamRequestDTO.getNomeDonoTime(), 100.0);

        Team teamCreated = teamService.createTeam(team);

        TeamResponseDTO teamResponseDTO = new TeamResponseDTO(
                teamCreated.getName(),
                teamCreated.getOwnerName(),
                teamCreated.getTeamValue()
        );
        return ResponseEntity.ok(teamResponseDTO);
    }
}
