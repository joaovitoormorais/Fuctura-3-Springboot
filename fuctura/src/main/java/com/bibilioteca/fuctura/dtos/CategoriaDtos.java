package com.bibilioteca.fuctura.dtos;

import org.intellij.lang.annotations.Pattern;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CategoriaDtos {

    private Integer id;
    @NotEmpty(message = "O campo nome é necessário!")
    @Size(min = 3, max = 20, message = "O campo nome deve conter entre 3 e 20 caracteres")
    private String nome;
    private String descricao;
    @Size(min = 20, max = 50, message = "O campo descricao deve conter entre 20 e 50 caracteres")
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
