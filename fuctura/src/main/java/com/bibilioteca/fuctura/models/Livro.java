package com.bibilioteca.fuctura.models;

import com.bibilioteca.fuctura.dtos.LivrosDtos;
import com.bibilioteca.fuctura.enums.Tamanho;

import javax.persistence.*;
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String autor;
    private String texto;
    private String titulo;

    private Tamanho tamanho;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Livro() {
    }

    public Livro(Integer id, String autor, String texto, String titulo, Tamanho tamanho, Categoria categoria) {
        this.id = id;
        this.autor = autor;
        this.texto = texto;
        this.titulo = titulo;
        this.tamanho = tamanho;
        this.categoria = categoria;
    }

    public Livro(LivrosDtos livrosDtos) {
        this.id = livrosDtos.getId();
        this.autor = livrosDtos.getAutor();
        this.texto = livrosDtos.getTexto();
        this.titulo = livrosDtos.getTitulo();
        this.tamanho = livrosDtos.getTamanho();
        this.categoria = livrosDtos.getCategoria();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}