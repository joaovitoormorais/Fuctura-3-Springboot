package com.bibilioteca.fuctura.dtos;

import org.hibernate.validator.constraints.Length;
import org.intellij.lang.annotations.Pattern;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CategoriaDtos {

    private Integer id;
  @NotEmpty(message = "O campo nome não pode ficar vazio!")

    private String nome;
    private String descricao;
   @Size(min = 3, max = 20, message = "O campo nome deve conter entre 3 a 20 caracteres!")
   @NotEmpty(message = "O campo descrição não pode ficar vazio!")
   @Length(min = 20, max = 40, message = "O campo descrição deve conter entre 20 a 40 caracteres")
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
