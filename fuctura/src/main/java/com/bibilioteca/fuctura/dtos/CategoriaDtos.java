package com.bibilioteca.fuctura.dtos;

public class CategoriaDtos {

    private Integer id;
    private String nome;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public CategoriaDtos(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
}
