package br.com.topper.controller;

import br.com.topper.dto.request.TeamRequestDTO;
import br.com.topper.dto.response.TeamResponseDTO;
import br.com.topper.services.TeamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/time")
@Slf4j
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<TeamResponseDTO> newTeam(@RequestBody TeamRequestDTO teamRequestDTO) {
        log.info("Recebendo requisição para criar um novo time: {}", teamRequestDTO);

        teamService.createTeam(teamRequestDTO.getNome(), teamRequestDTO.getNomeDonoTime());

        return null;
    }

}
