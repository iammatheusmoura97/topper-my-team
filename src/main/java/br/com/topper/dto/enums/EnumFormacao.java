package br.com.topper.dto.enums;

public enum EnumFormacao {

    FORMACAO_4_3_3(1, "4-3-3", 3, 3, 2, 2),
    FORMACAO_4_4_2(2, "4-3-3", 2, 4, 2, 2),
    FORMACAO_3_4_3(3, "4-3-3", 3, 4, 4, 0)
    ;

    private Integer codigo;
    private String nome;
    private Integer qtdAtacantes;
    private Integer qtdMeioCampistas;
    private Integer qtdZagueiro;
    private Integer qtdLaterais;

    EnumFormacao(Integer codigo, String nome, Integer qtdAtacantes, Integer qtdMeioCampistas, Integer qtdZagueiro, Integer qtdLaterais) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdAtacantes = qtdAtacantes;
        this.qtdMeioCampistas = qtdMeioCampistas;
        this.qtdZagueiro = qtdZagueiro;
        this.qtdLaterais = qtdLaterais;
    }
}
