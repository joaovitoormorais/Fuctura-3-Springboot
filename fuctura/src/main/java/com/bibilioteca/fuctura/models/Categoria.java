package com.bibilioteca.fuctura.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;

@OneToMany(mappedBy = "categoria")
  private List<Livro> livros = new ArrayList<>();

    public Categoria() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
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

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Categoria(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
}
