package br.com.topper.dto.enums;

public enum StatusEnum {

    PROVAVEL(1, "Provável"),
    DUVIDA(2, "Dúvida"),
    SUSPENSO(3, "Suspenso"),
    CONTUNDIDO(4, "Contundido");

    private Integer codigo;
    private String nome;

    StatusEnum(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

}
