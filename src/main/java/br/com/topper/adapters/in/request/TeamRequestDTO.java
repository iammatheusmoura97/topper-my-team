package br.com.topper.adapters.in.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TeamRequestDTO {

    private String nome;
    private String nomeDonoTime;

    public TeamRequestDTO(String nome, String nomeDonoTime) {
        this.nome = nome;
        this.nomeDonoTime = nomeDonoTime;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDonoTime() {
        return nomeDonoTime;
    }
}
