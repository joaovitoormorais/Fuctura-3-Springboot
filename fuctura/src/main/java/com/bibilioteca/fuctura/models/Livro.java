package com.bibilioteca.fuctura.models;

import com.bibilioteca.fuctura.enums.Tamanho;

import javax.persistence.*;
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
    private String texto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    private Tamanho tamanho;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public Livro(Integer id, String titulo, String autor, String texto, Tamanho tamanho, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.texto = texto;
        this.tamanho = tamanho;
        this.categoria = categoria;
    }
}
