package br.com.topper.domain.enums;

public enum JogadorStatus {

    PROVAVEL(1, "Provável"),
    DUVIDA(2, "Dúvida"),
    SUSPENSO(3, "Suspenso"),
    CONTUNDIDO(4, "Contundido");

    private Integer codigo;
    private String nome;

    JogadorStatus(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

}
